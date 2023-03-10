//spread Operator 
let sumArray = (...arrl) =>
{
    console.log(arrl)
    let sum=0
    for(let ele of arrl)
    {
        sum+=ele
    }
     console.log(sum)
}
sumArray(10,20,30,40,50,60,70)

//Default parameter
let Func = (a, b = 10) => {
    return a + b; 
   }
   Func(20);        //// 20 + 10 = 30

let NotWorkingFunction = (a = 10, b) => {
   return a + b;
   }
   NotWorkingFunction(20); // NAN. Not gonna work.
   NotWorkingFunction(20, 30); // 50;
   
//maps
let myMap = new Map()
myMap.set('name' , "Mahabharath")
myMap.set('country','India')
myMap.set('id','3000 BC')

myMap.get('name')
myMap.get('id')
myMap.get('country')

// console.log(myMap.keys())
// console.log(myMap.values())

// for(let key of myMap)
// {
//     console.log(key)
// }

for(let key in myMap)
{
    console.log(key , myMap.get(key))
}


//sets in js
let mySet = new Set()
mySet.add(10)
mySet.add(20)
mySet.add(30)
mySet.add(30)

console.log(mySet)
console.log(mySet.size)
console.log(mySet.has(30))
console.log(mySet.has(40))
for(let elem of mySet)
console.log(elem)

//static method
class cName
{
    static mName()  //need not use function keyword
    {
        console.log("hello static Method")
    }
}
cName.mName()   //need not create object


//getters and setters
class getSet
{
    constructor(name)
    {
    this.name= name
    }
    get Name()
    {
    return this.name;
    }
    set Name(name)
    {
        this.name= name
    }

}
let obj = new getSet("Sushanth Singh");
console.log(obj.Name)
obj.name="Rajput"
console.log(obj.Name)
