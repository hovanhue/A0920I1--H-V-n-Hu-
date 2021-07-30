import { Component, OnInit } from '@angular/core';
import {Article} from '../../models/Article';
import {articles} from '../../reponsitory/articleLists';

@Component({
  selector: 'app-article-list',
  templateUrl: './article-list.component.html',
  styleUrls: ['./article-list.component.css']
})
export class ArticleListComponent implements OnInit {

  constructor() { }

  articles: Article[] = articles;
  article: Article;
  ngOnInit(): void {
    this.articles = articles;
  }

}
