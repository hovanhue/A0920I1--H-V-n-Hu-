import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {ArticleService} from '../service/ArticleService';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-create-article',
  templateUrl: './create-article.component.html',
  styleUrls: ['./create-article.component.css']
})
export class CreateArticleComponent implements OnInit {

  @Output() addArticleOutput = new EventEmitter<any>();
  constructor(private articleService: ArticleService) { }

  ngOnInit(): void {
  }

  onSubmit(createArticle: NgForm) {
    this.articleService.createArticle(createArticle.value);
  }

}
