import { Component, OnInit } from '@angular/core';
import {FilesService} from '../../services/files.service';
import {Observable} from 'rxjs';
import {HttpEventType, HttpResponse} from '@angular/common/http';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.scss']
})
export class UploadComponent implements OnInit {
  selectedFiles: FileList;
  message = '';

  fileInfos: Observable<any>;

  constructor(private fileService: FilesService) { }

  ngOnInit(): void {
    this.fileInfos = this.fileService.getFiles();
  }

  selectFiles(event): void {
    this.selectedFiles = event.target.files;
  }

  uploadFiles(): void {
    console.log('se', this.selectedFiles);
    this.message = '';

    for (let i = 0; i < this.selectedFiles.length; i++) {
      this.upload(this.selectedFiles[i]);
      console.log('index', this.selectedFiles[i]);
    }
  }

  upload(file): void {
    this.fileService.upload(file).subscribe(
      event => {
        this.fileInfos = this.fileService.getFiles();
      },
      err => {
        this.message = 'Could not upload the file:' + file.name;
      });
  }
}
