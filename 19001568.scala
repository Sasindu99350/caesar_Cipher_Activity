
import scala.io.StdIn._

object caesarCipher extends App {

      
      val alphebet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      val E=(c:Char,s:String,key:Int)=>((s.indexOf(c.toUpper)+key)%26)
      val E_str=((word:String,key:Int)=>(((word.map(y=>E(y,alphebet,key))).map(a=>alphebet(a))).map(y=>y.toString)).reduce((x,y)=>x+y))
      val D=(c:Char,s:String,key:Int)=>((s.indexOf(c.toUpper)-key)%26)
      val D_str=((word:String,key:Int)=>((((word.map(y=>D(y,alphebet,key))).map(a=>alphebet(a))).map(y=>y.toString)).map(x=>x.toLowerCase)).reduce((x,y)=>x+y))
      print("Enter here string:")
      val str=readLine();
      print("Enter here key(shift value):")
      val key=readInt();
      
      println("Encripted: "+E_str(str,key));
      println("Dycripted: "+D_str(E_str(str,key),key));
        
      
      
  
  


  
  
  
  
}