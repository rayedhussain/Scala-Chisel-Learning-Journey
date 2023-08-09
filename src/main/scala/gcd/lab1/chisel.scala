package lab1
import chisel3._
import chisel3.util._

class chisel extends Module{
    val io = IO(new Bundle{
        val in1=Input(UInt(3.W))
        val in2=Input(UInt(3.W))
        val sum=Output(UInt(3.W))
        val carry=Output(UInt(3.W))
    })
    io.carry:=(io.in1 & io.in2)
    io.sum:=(io.in1 ^ io.in2)
}