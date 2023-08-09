
package lab1
import chisel3._
import chisel3.util._
import java.io.File

class counter_up_down ( n : Int ) extends Module {
def gencountern(n:Int,maz:UInt,reload1:Bool)={

  var reload2=reload1
  when(reload2 === 0.B){
    when(count===max){
      io.out:=true.B
      count:=count-1.U
      reload2 :=true.Bool
    }.otherwise{
      io.out:=false.B
      count:=count+1.U
    }
  }.elsewhen(reload2===1.B){
    when(count===0.U){
      io.out:=true.B
      count:=count+1
      reload2:=false.B
    }.otherwise{
      io.out:=false.B
      count:=count-1.U
    }
  }
}}