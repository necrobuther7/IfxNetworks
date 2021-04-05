import { Component } from '@angular/core';
import { Router } from '@angular/router'
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ifNetworksCli';

  constructor(private router:Router){}

  Listar(){
    this.router.navigate(["list"])
  }

  Nuevo(){
    this.router.navigate(["add"])
  }
}
