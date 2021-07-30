import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {NgForm} from '@angular/forms';
import {articles} from '../../reponsitory/articleLists';
import {Article} from '../../models/Article';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {ArticleService} from '../../service/ArticleService';

@Component({
  selector: 'app-article-update',
  templateUrl: './article-update.component.html',
  styleUrls: ['./article-update.component.css']
})
export class ArticleUpdateComponent implements OnInit {
  @Output() sendArticle = new EventEmitter();
  article: Article;
  id: any;
  constructor(
    private activatedRoute: ActivatedRoute,
    private articleService: ArticleService
  ) { }
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)  => {
      console.log('param' + paramMap.get('id'));
      this.id = paramMap.get('id');
    });
    this.article = articles.find(article => article.id = this.id);
  }
  onSubmit(updateArticle: NgForm){
    this.articleService.updateArticle(updateArticle.value);
  }

}
