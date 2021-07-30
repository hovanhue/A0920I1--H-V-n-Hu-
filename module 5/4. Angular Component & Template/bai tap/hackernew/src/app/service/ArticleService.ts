import {articles} from '../reponsitory/articleLists';
import { Article } from '../models/Article';

export class ArticleService {
  article: Article;

  public getArticles() {
    return articles;
  }

  public updateArticle(updateArticle: Article) {
  }

  public createArticle(createArticle: Article) {
    articles.push(createArticle);
  }
}
