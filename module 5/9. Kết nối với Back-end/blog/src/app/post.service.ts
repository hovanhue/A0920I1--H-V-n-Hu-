import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';
import {IPost} from './ipost';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  private readonly API_URL = 'https://jsonplaceholder.typicode.com/posts';
  constructor(private http: HttpClient) { }
  getPosts(count = 10): Observable<IPost[]> {
    console.log(this.http.get<IPost[]>(this.API_URL));
    return this.http.get<IPost[]>(this.API_URL).pipe(
      map(response => response.filter((post, i) => i < count))
    );
  }
  getPostById(id: number): Observable<IPost> {
    return this.http.get<IPost>(`${this.API_URL}/${id}`);
  }
  createPost(post: Partial<IPost>): Observable<IPost> {
    return this.http.post<IPost>(this.API_URL, post);
  }
  deletePost(id: number): Observable<any> {
    return this.http.delete(`${this.API_URL}/${id}`);
  }
  updatePost(post: IPost): Observable<IPost> {
    return this.http.patch<IPost>(`${this.API_URL}/${post.id}`, post);
  }
}
