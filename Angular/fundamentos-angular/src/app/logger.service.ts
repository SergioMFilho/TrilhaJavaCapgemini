import { Injectable } from '@angular/core';

@Injectable({  // para injetar nos componentes
  providedIn: 'root'
})
export class LoggerService {
  mensagens: string[] = [];

  logar(mensagem:string) {
    console.log(mensagem);
    this.mensagens.push(mensagem);
  }

  exibeTodosOsLogs() {
    console.log(this.mensagens);
  }
}
