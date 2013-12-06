/*
Обьекты этого класса создаются в цикле в class_0 и все..
Похоже на игровой обьект
*/

package defpackage;

// $FF: renamed from: b
public final class class_3 {

   // $FF: renamed from: a int[]
   public static /*final*/ int[] field_219;
   // $FF: renamed from: b int[]
   public static /*final*/ int[] field_220;
   // $FF: renamed from: c int[]
   public static /*final*/ int[] field_221;
   // $FF: renamed from: d int[]
   public static /*final*/ int[] field_222;
   // $FF: renamed from: e int[]
   public static /*final*/ int[] field_223;
   // $FF: renamed from: f int[]
   public static /*final*/ int[] field_224;
   // $FF: renamed from: g int[]
   public static /*final*/ int[] field_225;
   // $FF: renamed from: h int[]
   public static /*final*/ int[] field_226;
   // $FF: renamed from: a int[][]
   public static /*final*/ int[][] field_227;
   // $FF: renamed from: i int[]
   public static /*final*/ int[] field_228;
   // $FF: renamed from: b int[][]
   public static /*final*/ int[][] field_229;
   // $FF: renamed from: a boolean
   public boolean field_230;
   // $FF: renamed from: a int
   public int field_231;
   // $FF: renamed from: b boolean
   public boolean field_232;
   // $FF: renamed from: a f
   public GameCanvas field_233;
   // $FF: renamed from: b int
   public int field_234;
   // $FF: renamed from: c int
   public int field_235;
   // $FF: renamed from: d int
   public int field_236;
   // $FF: renamed from: e int
   public int field_237;
   // $FF: renamed from: f int
   public int field_238;
   // $FF: renamed from: g int
   public int field_239;
   // $FF: renamed from: h int
   public int field_240;
   // $FF: renamed from: i int
   public int field_241;
   // $FF: renamed from: c boolean
   public boolean field_242;
   // $FF: renamed from: j int
   public int field_243;
   // $FF: renamed from: k int
   public int field_244;
   // $FF: renamed from: l int
   public int field_245;
   // $FF: renamed from: m int
   public int field_246;
   // $FF: renamed from: n int
   public int field_247;
   // $FF: renamed from: o int
   public int field_248;
   // $FF: renamed from: p int
   public int field_249;
   // $FF: renamed from: q int
   public int field_250;
   // $FF: renamed from: r int
   public int field_251;
   // $FF: renamed from: s int
   public int field_252;
   // $FF: renamed from: t int
   public int field_253;
   // $FF: renamed from: u int
   public int field_254;
   // $FF: renamed from: j int[]
   public int[] field_255;
   // $FF: renamed from: v int
   public int field_256;
   // $FF: renamed from: w int
   public int field_257;
   // $FF: renamed from: x int
   public int field_258;
   // $FF: renamed from: y int
   public int field_259;
   // $FF: renamed from: d boolean
   public boolean field_260;
   // $FF: renamed from: e boolean
   public boolean field_261;
   // $FF: renamed from: z int
   public int field_262;
   // $FF: renamed from: a byte
   public byte field_263;
   // $FF: renamed from: A int
   public int field_264;


   // $FF: renamed from: <init> () void
   // method_158
   public class_3() {
      this.field_233 = GameCanvas.getInstance();
   }

   // $FF: renamed from: a (b) int
   public final int method_159(class_3 var1) {
      int var2 = this.method_186(var1);
      int var3 = field_229[var2][0] * field_229[this.field_247][0] + field_229[var2][1] * field_229[this.field_247][1];
      int var4 = field_229[var2][0] * field_229[var2][0] + field_229[var2][1] * field_229[var2][1];
      int var5 = field_229[this.field_247][0] * field_229[this.field_247][0] + field_229[this.field_247][1] * field_229[this.field_247][1];
      int var6;
      return ((var6 = var3 * var3) << 5) / var4 / var5 <= 16?this.field_255[1]:(var3 < 0?this.field_255[2]:this.field_255[0]);
   }

   // $FF: renamed from: b (b) int
   public final int method_160(class_3 var1) {
      int var2 = (this.field_253 >> 1) + (this.field_253 >> 2) + GameCanvas.method_2(this.field_253 >> 2) - GameCanvas.method_2(this.field_258 - this.field_248);
      if(this.field_250 < 4) {
         var2 += this.field_253 * this.field_233.arr_class_1[this.field_263].field_158[this.field_250] >> 3;
      }

      int var3 = var1.method_159(this);
      if(this.field_250 == 0) {
         if(this.method_175(var1.field_236, var1.field_237) <= 2) {
            var2 <<= 2;
         }
      } else {
         var2 -= (var3 >> 1) + (var3 >> 2) + GameCanvas.method_2(var3 >> 2);
      }

      if(this.field_250 == 3) {
         if(var1.field_250 == 2) {
            var2 += GameCanvas.method_2(this.field_253 >> 1);
         }

         if(this.method_175(var1.field_236, var1.field_237) <= 4) {
            var2 >>= 1;
         }

         if(var1.field_250 == 1) {
            var2 >>= 1;
         }
      }

      if(var1.field_250 == 0) {
         switch(this.field_250) {
         case 2:
         case 3:
            var2 >>= 2;
         }
      }

      if(this.field_250 == 2) {
         switch(var1.field_250) {
         case 3:
            var2 >>= 2;
         }
      }

      return var2;
   }

   // $FF: renamed from: c (b) int
   public final int method_161(class_3 var1) {
      int var2;
      if((var2 = this.method_160(var1)) < 10) {
         var2 = 10;
      }

      var1.field_259 -= var2;
      if(var1.field_259 <= 0) {
         var1.field_259 = 0;
         var1.field_242 = true;
      }

      this.field_248 = 0;
      this.field_230 = true;
      return var2;
   }

   // $FF: renamed from: a (b) boolean
   public final boolean method_162(class_3 var1) {
      return this.method_163(var1.field_236, var1.field_237);
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean method_163(int var1, int var2) {
      return this.method_164(var1, var2) && this.field_248 >= this.field_258;
   }

   // $FF: renamed from: b (int, int) boolean
   public final boolean method_164(int var1, int var2) {
      return this.field_250 == 4?false:this.method_175(var1, var2) <= this.field_254 * this.field_254;
   }

   // $FF: renamed from: c (int, int) boolean
   public final boolean method_165(int var1, int var2) {
      int var3;
      return this.field_250 != 4?false:(this.field_248 < this.field_251?false:(this.method_175(var1, var2) != 1?false:(var3 = this.field_233.method_67(var1, var2)) != 1000 && var3 != 100));
   }

   // $FF: renamed from: a () boolean
   public final boolean method_166() {
      return this.method_165(this.field_236 - 1, this.field_237) || this.method_165(this.field_236 + 1, this.field_237) || this.method_165(this.field_236, this.field_237 - 1) || this.method_165(this.field_236, this.field_237 + 1);
   }

   // $FF: renamed from: a (int, int) void
   public final void method_167(int var1, int var2) {
      if(this.field_233.method_54(var1, var2) == 5) {
         this.field_248 = 0;
         this.field_233.method_50(var1, var2);
      }

   }

   // $FF: renamed from: d (int, int) boolean
   public final boolean method_168(int var1, int var2) {
      return this.field_250 != 4?false:(this.method_175(var1, var2) != 1?false:(this.field_248 < this.field_251?false:this.field_233.method_54(var1, var2) == 5));
   }

   // $FF: renamed from: b () boolean
   public final boolean method_169() {
      return this.method_168(this.field_236 - 1, this.field_237) || this.method_168(this.field_236 + 1, this.field_237) || this.method_168(this.field_236, this.field_237 - 1) || this.method_168(this.field_236, this.field_237 + 1);
   }

   // $FF: renamed from: e (int, int) boolean
   public final boolean method_170(int var1, int var2) {
      class_1 var3;
      return this.field_248 < this.field_251?false:(this.method_175(var1, var2) != 1?false:((var3 = this.field_233.arr_class_1[this.field_263]).method_102(var1, var2)?true:var3.method_122().method_103(var1, var2, this.field_263)));
   }

   // $FF: renamed from: c () boolean
   public final boolean method_171() {
      return this.method_170(this.field_236 - 1, this.field_237) || this.method_170(this.field_236 + 1, this.field_237) || this.method_170(this.field_236, this.field_237 - 1) || this.method_170(this.field_236, this.field_237 + 1);
   }

   // $FF: renamed from: f (int, int) boolean
   public final boolean method_172(int var1, int var2) {
      class_3 var3;
      return this.field_250 != 4?false:(this.field_248 < this.field_258?false:(this.method_175(var1, var2) != 1?false:(var3 = this.field_233.method_56(var1, var2)) != null && var3.field_259 != var3.field_257 && var3.field_263 == this.field_263));
   }

   // $FF: renamed from: d () boolean
   public final boolean method_173() {
      return this.method_172(this.field_236 + 1, this.field_237) || this.method_172(this.field_236 - 1, this.field_237) || this.method_172(this.field_236, this.field_237 + 1) || this.method_172(this.field_236, this.field_237 - 1);
   }

   // $FF: renamed from: d (b) int
   public final int method_174(class_3 var1) {
      int var2 = 40 + GameCanvas.method_2(this.field_248 - this.field_258) >> 1;
      var1.field_259 += var2;
      this.field_248 = 0;
      if(var1.field_259 > var1.field_257) {
         var2 -= var1.field_259 - var1.field_257;
         var1.field_259 = var1.field_257;
      }

      return var2;
   }

   // $FF: renamed from: a (int, int) int
   public final int method_175(int var1, int var2) {
      return (this.field_236 - var1) * (this.field_236 - var1) + (this.field_237 - var2) * (this.field_237 - var2);
   }

   // $FF: renamed from: a (int, int, int, int, byte, byte) void
   public final void method_176(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      this.field_236 = var1;
      this.field_237 = var2;
      this.field_249 = var6;
      this.field_263 = var5;
      this.method_184(var4);
      this.field_234 = this.field_233.method_39(var1);
      this.field_235 = this.field_233.method_40(var2);
      this.field_230 = false;
      this.method_177(var3);
   }

   // $FF: renamed from: a (int) void
   public final void method_177(int var1) {
      this.field_246 = var1;
      this.field_231 = 6;
      switch(this.field_246) {
      case 0:
         this.field_238 = 196;
         this.field_250 = 0;
         this.field_231 = 2;
         break;
      case 1:
         this.field_238 = 147;
         this.field_250 = 0;
         this.field_231 = 2;
         break;
      case 2:
      case 3:
         this.field_238 = 238;
         this.field_250 = 1;
         break;
      case 4:
         this.field_238 = 178;
         this.field_250 = 1;
         break;
      case 5:
      case 6:
         this.field_238 = 227;
         this.field_250 = 2;
         break;
      case 7:
      case 8:
         this.field_238 = 138;
         this.field_250 = 2;
         break;
      case 9:
         this.field_238 = 108;
         this.field_250 = 3;
         break;
      case 10:
         this.field_238 = 129;
         this.field_250 = 3;
         break;
      case 11:
         this.field_238 = 187;
         this.field_250 = 4;
         break;
      case 12:
         this.field_238 = 187;
         this.field_250 = 4;
      }

      this.field_251 = field_223[var1];
      this.field_252 = field_222[var1];
      this.field_253 = field_221[var1];
      this.field_254 = field_225[var1];
      this.field_255 = field_227[var1];
      this.field_256 = field_228[var1];
      this.field_259 = this.field_257 = field_224[var1];
      this.field_258 = field_226[var1];
      this.field_242 = false;
      this.field_260 = false;
      this.field_261 = false;
      this.method_188();
   }

   // $FF: renamed from: a (int) int
   public final int method_178(int var1) {
      return var1 < 0?-1:(var1 > 0?1:0);
   }

   // $FF: renamed from: b (int) void
   public final void method_179(int var1) {
      int var2;
      if((var2 = var1 - this.field_247) != 0) {
         this.field_264 = 1;
         this.field_262 = this.method_178(var2);
         if(Math.abs(var2) >= 4) {
            this.field_262 = -this.field_262;
         }

         this.field_243 = var1;
         this.field_261 = true;
         this.field_230 = false;
      }

   }

   // $FF: renamed from: a () void
   public final void method_180() {
      if(this.field_261 && --this.field_264 < 0) {
         this.method_184(this.field_247 + this.field_262);
         this.field_264 = 1;
         if(this.field_247 == this.field_243) {
            this.field_261 = false;
         }
      }

   }

   // $FF: renamed from: b (int, int) void
   public final void method_181(int var1, int var2) {
      this.field_244 = this.method_178(var1 - this.field_234);
      this.field_245 = this.method_178(var2 - this.field_235);
      if(this.field_244 != 0 || this.field_245 != 0) {
         this.field_239 = var1;
         this.field_240 = var2;
         this.field_260 = true;
         this.field_230 = false;
      }

   }

   // $FF: renamed from: b () void
   public final void method_182() {
      if(this.field_260) {
         int var1 = this.method_178(this.field_239 - this.field_234);
         int var2 = this.method_178(this.field_240 - this.field_235);
         this.field_234 += this.field_244 * this.field_231;
         this.field_235 += this.field_245 * this.field_231;
         if(this.method_178(this.field_239 - this.field_234) != var1 || this.method_178(this.field_240 - this.field_235) != var2) {
            this.method_183(this.field_239, this.field_240);
            this.field_260 = false;
         }
      }

   }

   // $FF: renamed from: c (int, int) void
   public final void method_183(int var1, int var2) {
      this.field_234 = var1;
      this.field_235 = var2;
      this.field_236 = this.field_233.method_41(this.field_234);
      this.field_237 = this.field_233.method_42(this.field_235);
   }

   // $FF: renamed from: c (int) void
   public final void method_184(int var1) {
      this.field_247 = var1;
      if(this.field_247 >= 8) {
         this.field_247 = 0;
      }

      if(this.field_247 < 0) {
         this.field_247 = 7;
      }

      this.field_241 = this.field_247;
   }

   // $FF: renamed from: a (int, int, int, int) void
   public final void method_185(int var1, int var2, int var3, int var4) {
      this.method_184(this.method_187(var1, var2, var3, var4));
   }

   // $FF: renamed from: e (b) int
   public final int method_186(class_3 var1) {
      return this.method_187(this.field_234, this.field_235, var1.field_234, var1.field_235);
   }

   // $FF: renamed from: a (int, int, int, int) int
   public final int method_187(int var1, int var2, int var3, int var4) {
      int var5 = var3 - var1;
      int var6 = var4 - var2;
      int var7 = var5 * 10;
      boolean var8 = false;
      if(var6 != 0) {
         var7 /= var6;
      } else {
         var7 *= 10;
      }

      int var9;
      if(var7 < -23) {
         var9 = 0;
      } else if(var7 < -4) {
         var9 = 1;
      } else if(var7 < 4) {
         var9 = 2;
      } else if(var7 < 23) {
         var9 = 3;
      } else {
         var9 = 4;
      }

      if(var6 >= 0) {
         var9 += 4;
      }

      if(var9 > 7) {
         var9 = 0;
      }

      return var9;
   }

   // $FF: renamed from: c () void
   public final void method_188() {
      if(!this.field_242) {
         this.field_248 = this.field_251;
      }

      this.field_232 = true;
   }

   // $FF: renamed from: d () void
   public final void method_189() {
      this.field_259 = 0;
      this.field_241 = 8;
      this.field_242 = true;
      this.field_232 = false;
      this.field_230 = false;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_219 = new int[]{9, 1, 10, 3, 11, 5, 12, 7};
      field_220 = new int[]{13, 17, 21, 25};
      field_221 = new int[]{15, 15, 60, 70, 55, 95, 130, 108, 121, 200, 180, 0, 0};
      field_222 = new int[]{5, 5, 3, 3, 3, 4, 4, 4, 4, 3, 3, 3, 3};
      field_223 = new int[]{30, 30, 68, 68, 48, 44, 42, 52, 56, 24, 24, 68, 76};
      field_224 = new int[]{100, 100, 250, 250, 200, 400, 400, 300, 350, 200, 200, 200, 200};
      field_225 = new int[]{3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 1, 1};
      field_226 = new int[]{10, 10, 18, 18, 18, 20, 20, 25, 20, 14, 14, 20, 30};
      field_227 = new int[][]{{0, 0, 0}, {0, 0, 0}, {27, 18, 10}, {36, 31, 7}, {35, 15, 7}, {37, 27, 35}, {33, 26, 32}, {37, 16, 19}, {56, 25, 27}, {15, 0, 0}, {15, 0, 0}, {10, 5, 5}, {10, 5, 5}};
      field_228 = new int[]{80, 80, 5, 7, 8, 12, 13, 9, 11, 6, 6, -5, -5};
      field_229 = new int[][]{{1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}};
   }
}
