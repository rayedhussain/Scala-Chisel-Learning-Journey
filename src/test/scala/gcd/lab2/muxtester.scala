package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class muxtester extends FreeSpec with ChiselScalatestTester{
    "updownCounter2tester file " in {
        test(new Mux){ a=>
        a.clock.step(12)
        a.io.inA.poke(0.B)
        a.io.inB.poke(1.B)
        a.io.select.poke(1.B)
        a.io.out.expect(1.B)
        }}}