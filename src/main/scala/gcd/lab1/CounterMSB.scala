// package lab1
// import chisel3._
// import chisel3.util._

// class CounterMSB(size : UInt ) extends Module {
  
//    val io = IO ( new Bundle {
//         val result = Output ( Bool () )
//           })  
          
//     val count = RegInit (0.U (16. W ) )    
//     val max= (1.U << size) - (1.U << (size-1))
//     when ( count === max) {
//         count := 0. U
        
//     }  10000
//     .otherwise {
//         count := count + 1. U
//     }
//     io.result:=count
    
    
// }
