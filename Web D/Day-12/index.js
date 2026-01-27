console.log("Hello");

let btn= document.querySelector('button')
let body= document.querySelector('body')
let isDark=true;

btn.addEventListener('click',function(){
   
    if(isDark){
        body.style.backgroundColor='blue'
        body.style.color='white'
        isDark=false;
    }
    else{
        body.style.backgroundColor='red'
        body.style.color='black'
        isDark=true;
    }
});