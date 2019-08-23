import java.util.Date

object HelloScala {

  object Math{
    def +(x: Int, y: Int): Int ={
      return x+y
    }

    def ** (x: Int): Int ={
      return x*x
    }
  }

  def main(args: Array[String]): Unit ={

   val name = "mark"
   val age = 40.5

   println("Hello Scala...")
   println("his name is "+name+" and he is "+ age+ " years old")
   println(s"$name is $age years old")
   println(f"$name%s is $age%f years old")
   println(s"Hello \nScala")
   println(raw"Helloo \n Scala")

   /* trying if else*/

   val a=200
   var res = "";

   if(a==20){
     res = "x==20"
   }
   else{
     res = "x!=20"
   }

   println(res)

   val res2 = if (a==20) "x==20" else "x!=20"
   println(res2)

   /*loops*/

   var i = 0;

   while(i<10){
     println("i= "+i)
     i +=1
   }

   for(a <- 1.to(5)){
     println("hello scala "+ a)
   }

   for(a <- 1.until(5)){
     println("hello scala "+ a)
   }

   for(a <- 1.until(5); j <- 1 to 3){
     println("hello scala "+ a + " " + j)
   }

   val lst = List(100,200,300)

   for(i <- lst){
     println("hiii list "+i)
   }
   lst.foreach(i => println("foreach "+ i))

   // using for loop as expressions
   val result = for{i <- lst; if i<=300} yield {
     i*5
   }
   println("value of for expression: "+result)

   val age1=200

   age1 match {
     case 20 => println(age1)
     case 100 => println(age1)

     case _ => println("default")
   }


   val result1 = age1 match {
     case 20 => age1
     case 100 => age1
     case _ => "default"
   }
   println("result1 :" + result1)

   var num = 8

   num match{
     case 1|3|5|7|9 => println("odd number")
     case 2|4|6|8 => println("even number")
   }

   def add(x : Int, y : Int) : Int = {
     return x + y
   }

    def mul(x : Int, y : Int) : Int = x * y

    println("sum of 2 nos: "+ add(40,40))
    println("multiple : " + mul(5,3))

    println("math object :" + Math.+(5,5))
    println("square :"+Math ** (10))

    // anonymous function
    val add1 = (x:Int, y:Int) => x+y
    println("add: "+ add1(500,500))



    val funcresult = mathfunc(500,50, (x,y)=>x min y)
    val funcresult1 = mathfunc(500,50,  _ max _)
    println("funcresult: "+ funcresult)
    println("funcresult1: "+ funcresult1)

    val date = new Date;
    val newLog = log(date, _:String)
    newLog("test log message")

 }
  def mathfunc(x: Double, y:Double, f: (Double,Double)=>Double): Double = f(x,y);

  def log (date:Date, message:String) = {
    printf("log date and message: "+date + " " + message)
  }



}
