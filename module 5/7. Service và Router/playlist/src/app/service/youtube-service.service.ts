import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeServiceService {

  playlist = [
    {id: 'kJQP7kiw5Fk', song: 'Luis Fonsi - Despacito ft. Daddy Yankee'},
    {id: 'RgKAFK5djSk', song: 'Wiz Khalifa - See You Again ft. Charlie Puth [Official Video] Furious 7 Soundtrack'},
    {id: 'kfw7MYah2n0', song: '3107-3 | W/n x Nâu x Duongg x Titie | OFFICIAL MV'},
    {id: 'N3smdam4s', song: '♬Lofi Lyrics/ Cô đơn dành cho ai - Lee Ken x Nal'},
    {id: 'flREuRJCdxw', song: 'Đường Tôi Chở Em Về (Lofi Ver.) - buitruonglinh x Freak D'},
    {id: 'HZi4eJXWZU0', song: 'Rồi Tới Luôn - Nal (MV Audio Lyric)'}
  ];
  constructor() { }
  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
