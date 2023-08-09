package lab2
import chisel3 . _
// Mux IO interface class
class Mux extends Bundle {
val in_A = Input ( Bool () )
val in_B = Input ( Bool () )
val select = Input ( Bool () )
val out = Output ( Bool () )
}
// 2 to 1 Mux implementation
class Muxs extends Module {
val io = IO ( new Mux )
// update the output
io . out := io . in_A & io . select | io . in_B & (~ io . select )
}