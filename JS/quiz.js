let questions=[
    {
        question:"What is Java?",
        option1:"java is a object oriented programming language",
        option2:"java is a scripting language",
        option3:"java ia platform dependent language",
        option4:"java is a interpreter language",
        answer:"option1"
    },
    {
        question:"Who invented java programming?",
        option1:"Guido van Rossun",
        option2:"James Gosling",
        option3:"Dennis Ritchie",
        option4:"Bjarne Stroustrup",
        answer:"option2"
    },
    {
        question:"Which one of the following is not a java feature?",
        option1:"Object-oriented",
        option2:"use of pointers",
        option3:"portable",
        option4:"platform independant",
        answer:"option2"
    },
    {
        question:"What is the extension of java code files?",
        option1:".js",
        option2:".py",
        option3:".html",
        option4:".java",
        answer:"option4"
    }
]
let index=0;
let index1=-1;
let right=0;
let wrong=0;
let cardbody=document.querySelector(".card-body");
let main=null;
function showQuestions(index){
    main=document.createElement("div");
    main.setAttribute("class","main");
    main.innerHTML=`<h1>${questions[index].question}</h1>
                        <div class="mt-3">
                            <input type="radio" name="option">
                            <label for="Option1" checked="false" class="mx-2">${questions[index].option1}</label>
                        </div>
                        <div class="mt-3">
                            <input type="radio" name="option">
                            <label for="Option2" class="mx-2">${questions[index].option2}</label>
                        </div>
                        <div class="mt-3">
                            <input type="radio" name="option">
                            <label for="Option3" class="mx-2">${questions[index].option3}</label> 
                        </div>
                        <div class="mt-3">
                            <input type="radio" name="option">
                            <label for="Option4" class="mx-2">${questions[index].option4}</label>
                        </div>`

    cardbody.appendChild(main);
}

showQuestions(index);
document.querySelector("#submit").addEventListener("click",()=>{
    index1++;
    if(index1 < questions.length){
        if(calculateResult(index1)){
            right++;
            console.log(right);
        }
    }

    if(index<questions.length-1){
        cardbody.removeChild(main);
        index++;

        showQuestions(index);
    }
    else{
        showResult();
    }
})

function showResult(){
    cardbody.removeChild(main);
    document.querySelector("#submit").style.display="none";
    let cardfooter=document.querySelector(".card-footer");
    cardfooter.innerHTML=`
    <button id="submit" class="btn btn-success w-100 d-none">Submit</button>
    <button id="restart" class="btn btn-warning w-100">Restart</button>`;
    cardbody.innerHTML=`<h3>Thanks for giving Quiz</h3><p><b>${right} out of ${questions.length}</b></p>`;
    console.log("right",right);
    document.querySelector("#restart").addEventListener("click",()=>{
        cardfooter.innerHTML=`
        <button id="submit" class="btn btn-success w-100 ">Submit</button>
        <button id="restart" class="btn btn-warning w-100 d-none">Restart</button>`
        cardbody.innerHTML="";
        index=0;
        showQuestions(index);
        window.location.reload();
    })
}

function calculateResult(index1){
    let input=document.querySelectorAll("input");
    let ans=false;
    input.forEach(i=>{
        if(i.checked){
            check=true;
            if(i.value==questions[index1].answer){
                ans=true;
            }
        }
    })
    return ans;
}