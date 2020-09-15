import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UserlandingComponent } from './userlanding/userlanding.component';
import { NewuserComponent } from './newuser/newuser.component';
import { CreateaccountComponent } from './createaccount/createaccount.component';


const routes: Routes = [
  {path:'',component:LoginComponent},
  { path: 'user', component: UserlandingComponent },
  { path: 'newuser', component: NewuserComponent },
  { path: 'create/:form.value.pan', component: CreateaccountComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
