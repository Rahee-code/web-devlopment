let arr=[];
let curindex=null;
function init() {
    let d=localStorage.getItem("datas");
    if(d==null){
        return arr;
    }
    else{
        arr=JSON.parse(d);
        return arr;
    }
}
document.querySelector("#add").addEventListener("click",()=>{
        let text=  document.querySelector("#text").value;
        let date=document.querySelector("#date").value;
        addData(text,date);
        showData()
    
 
 
    
})
function addData(text,date) {
    let data={
        t:text,
        d:date
    }
    arr.push(data);
    localStorage.setItem("datas",JSON.stringify(arr));
    document.querySelector("#text").value="";
    document.querySelector("#date").value=""

}
function showData() {
    let div=document.querySelector("#output");
    console.log(arr);
    div.innerHTML="";
    arr.forEach((i,index)=>{
        let outputcontainer=document.createElement("div");
        outputcontainer.innerHTML=`
        <div class="row mt-3">
        <div class="col-md-5">
               <h3>${i.t}</h3>
            </div>
            <div class="col-md-5">
                <h3>${i.d}</h3>
            </div>
            <div class="col-md-2">
                <button class="btn btn-danger" onclick="deleteData(${index})">Delete</button>
                <button class="btn btn-warning" onclick="updateData(${index})">update</button>
            </div>
            </div>
        `
        div.appendChild(outputcontainer)
    })  
}
function deleteData(index) {
    arr.splice(index,1);
    localStorage.setItem("datas",JSON.stringify(arr));
    showData();
    
}

function updateData(index){
    document.querySelector("#text").value=arr[index].t;
    document.querySelector("#date").value=arr[index].d;
    document.querySelector("#add").style.display="none";
    document.querySelector("#update").style.display="";
    curindex=index;

}
   function saveUpdatedData(){
    document.querySelector("#add").style.display="";
    document.querySelector("#update").style.display="none";
    let text= document.querySelector("#text").value;
    let date=  document.querySelector("#date").value;
    let data={
        t:text,
        d:date
    }
    arr[curindex]=data;
    localStorage.setItem("datas",JSON.stringify(arr));
    document.querySelector("#text").value="";
    document.querySelector("#date").value=""
    showData();
   }

//    document.querySelector("#deleteall").addEventListener("click",()=>{
//     localStorage.removeItem("datas");
//     showData()
//    })
init()
showData()

