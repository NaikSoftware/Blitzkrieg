package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: e
public class class_1 {

   // $FF: renamed from: c int[][]
   public int[][] field_149;
   // $FF: renamed from: a boolean[]
   public boolean[] field_150;
   // $FF: renamed from: b boolean[]
   public boolean[] field_151;
   // $FF: renamed from: c int
   public int field_152;
   // $FF: renamed from: d int
   public int field_153;
   // $FF: renamed from: e int
   public int field_154;
   // $FF: renamed from: f int
   public int field_155;
   // $FF: renamed from: d int[][]
   public static /*final*/ int[][] field_156;
   // $FF: renamed from: e int[]
   public int[] field_157;
   // $FF: renamed from: a byte[]
   public byte[] field_158;
   // $FF: renamed from: g int
   public int field_159;
   // $FF: renamed from: h int
   public int field_160;
   // $FF: renamed from: i int
   public int field_161;
   // $FF: renamed from: a boolean
   public boolean field_162;
   // $FF: renamed from: j int
   public int field_163;
   // $FF: renamed from: k int
   public int field_164;
   // $FF: renamed from: l int
   public int field_165;
   // $FF: renamed from: m int
   public int field_166;
   // $FF: renamed from: a short
   public short field_167;
   // $FF: renamed from: n int
   public int field_168;
   // $FF: renamed from: b b
   public class_3 field_169;
   // $FF: renamed from: c b
   public class_3 field_170;
   // $FF: renamed from: o int
   public int field_171;
   // $FF: renamed from: a boolean[][]
   public boolean[][] field_172;
   // $FF: renamed from: p int
   public int field_173;
   // $FF: renamed from: a long
   public long field_174;
   // $FF: renamed from: f int[]
   public int[] field_175;
   // $FF: renamed from: c boolean[]
   public boolean[] field_176;
   // $FF: renamed from: q int
   public int field_177;
   // $FF: renamed from: r int
   public int field_178;
   // $FF: renamed from: s int
   public int field_179;
   // $FF: renamed from: t int
   public int field_180;
   // $FF: renamed from: u int
   public int field_181;
   // $FF: renamed from: v int
   public int field_182;
   // $FF: renamed from: w int
   public int field_183;
   // $FF: renamed from: x int
   public int field_184;
   // $FF: renamed from: y int
   public int field_185;
   // $FF: renamed from: z int
   public int field_186;
   // $FF: renamed from: A int
   public int field_187;
   // $FF: renamed from: B int
   public int field_188;
   // $FF: renamed from: C int
   public int field_189;
   // $FF: renamed from: D int
   public int field_190;
   // $FF: renamed from: b long
   public long field_191;
   // $FF: renamed from: c long
   public long field_192;
   // $FF: renamed from: e int[][]
   public int[][] field_193;
   // $FF: renamed from: g int[]
   public int[] field_194;
   // $FF: renamed from: E int
   public int field_195;
   // $FF: renamed from: F int
   public int field_196;
   // $FF: renamed from: G int
   public int field_197;
   // $FF: renamed from: H int
   public int field_198;
   // $FF: renamed from: I int
   public int field_199;
   // $FF: renamed from: b boolean
   public boolean field_200;
   // $FF: renamed from: a f
   public GameCanvas field_201;
   // $FF: renamed from: J int
   public int field_202;
   // $FF: renamed from: K int
   public int field_203;
   // $FF: renamed from: c boolean
   public boolean field_204;


   // $FF: renamed from: g () void
   public final void method_96() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.field_157[var1] = this.field_158[var1] = 0;
      }

   }

   // $FF: renamed from: b (b, int) void
   public final void method_97(class_3 var1, int var2) {
      int[] var3 = this.field_201.arr_class_1[0].field_157;
      byte[] var4 = this.field_201.arr_class_1[0].field_158;
      int var5 = var1.field_250;
      byte var6;
      if((var6 = var4[var5]) < 5) {
         var3[var5] += var2;
         if(var3[var5] >= field_156[var5][var6]) {
            var3[var5] -= field_156[var5][var6];
            ++var4[var5];
            this.field_171 = 32;
            this.field_192 = GameCanvas.timeMillis + this.field_191;
            this.field_201.field_class5.method_203(93, 140, 0);
            return;
         }
      } else {
         var3[var5] = 0;
      }

   }

   // $FF: renamed from: <init> () void
   // method_98
   public class_1() {
      this.field_149 = new int[15][2];
      this.field_150 = new boolean[15];
      this.field_151 = new boolean[15];
      this.field_157 = new int[]{0, 0, 0, 0};
      this.field_158 = new byte[]{(byte)0, (byte)0, (byte)0, (byte)0};
      this.field_162 = false;
      this.field_172 = (boolean[][])null;
      this.field_175 = new int[]{1, 3, 0};
      this.field_176 = new boolean[]{true, true, true};
      this.field_178 = -1;
      this.field_185 = 8;
      this.field_186 = 6;
      this.field_191 = 5000L;
      this.field_195 = 12;
      this.field_196 = 6;
      this.field_197 = 0;
      this.field_198 = 16384;
      this.field_202 = 0;
      this.field_203 = 0;
      this.field_201 = GameCanvas.getInstance();
      this.field_193 = new int[this.field_196][2];
      this.field_194 = new int[this.field_196];
      this.field_172 = new boolean[20][22];
   }

   // $FF: renamed from: a (int, int, short, boolean) void
   public final void method_99(int var1, int var2, short var3, boolean var4) {
      if(var4) {
         this.method_96();
      }

      this.field_167 = var3;
      this.field_159 = var1;
      this.field_160 = var2;
      this.field_161 = var1;
      this.field_171 = 10;

      int var5;
      for(var5 = 0; var5 < 15; ++var5) {
         this.field_150[var5] = true;
         this.field_151[var5] = false;
      }

      for(var5 = 0; var5 < this.field_201.mapCols; ++var5) {
         for(int var6 = 0; var6 < this.field_201.mapRows; ++var6) {
            this.field_172[var5][var6] = true;
         }
      }

      this.field_178 = -1;
      this.field_188 = -1;
      this.field_196 = 6;
      this.field_197 = 0;
   }

   // $FF: renamed from: a (int, int) void
   public final void method_100(int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 15 && !this.field_150[var3]; ++var3) {
         ;
      }

      if(var3 < 15) {
         this.field_150[var3] = false;
         this.field_149[var3][0] = var1;
         this.field_149[var3][1] = var2;
      }

   }

   // $FF: renamed from: b (int, int) void
   public final void method_101(int var1, int var2) {
      class_1 var3 = this.method_122();

      for(int var4 = 0; var4 < 15; ++var4) {
         if(!this.field_150[var4] && this.field_149[var4][0] == var1 && this.field_149[var4][1] == var2) {
            this.field_150[var4] = true;
            this.field_151[var4] = false;
            return;
         }

         if(!var3.field_150[var4] && var3.field_149[var4][0] == var1 && var3.field_149[var4][1] == var2) {
            var3.field_150[var4] = true;
            var3.field_151[var4] = false;
            return;
         }
      }

   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean method_102(int var1, int var2) {
      return this.method_103(var1, var2, this.field_167);
   }

   // $FF: renamed from: a (int, int, int) boolean
   public final boolean method_103(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 15; ++var4) {
         if(!this.field_150[var4] && var1 == this.field_149[var4][0] && var2 == this.field_149[var4][1] && (var3 == this.field_167 || this.field_151[var4])) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: d () void
   public void method_104() {
      int var3;
      switch(this.field_171) {
      case 10:
         if(this.field_162) {
            if(this.field_161 < 0) {
               this.method_134();
               return;
            }

            if(this.field_201.method_32(this.field_201.field_arr_class3_1[this.field_161].field_236, this.field_201.field_arr_class3_1[this.field_161].field_237) == 0) {
               this.method_134();
               this.field_201.method_63(this.field_161, true);
               this.field_201.method_77();
               return;
            }
         }
         break;
      case 11:
         ++this.field_203;
         if(this.field_162 && this.field_168 == 12) {
            if(this.field_201.method_32(this.field_170.field_236, this.field_170.field_237) != 0) {
               break;
            }

            this.method_134();
         }

         if(this.field_169.field_260) {
            if(this.field_204) {
               this.field_169.method_183(this.field_169.field_239, this.field_169.field_240);
               this.field_169.field_260 = false;
            } else {
               this.field_169.method_182();
            }

            this.field_201.method_30(this.field_169.field_234, this.field_169.field_235);
            if(!this.field_169.field_260) {
               this.field_169.field_248 = this.field_201.field_72[this.field_201.field_88[this.field_201.field_89][0]][this.field_201.field_88[this.field_201.field_89][1]];
               boolean var7 = this.method_105();
               if(--this.field_201.field_89 >= 0 && !var7) {
                  this.field_169.method_179(this.field_169.method_187(this.field_169.field_236, this.field_169.field_237, this.field_201.field_88[this.field_201.field_89][0], this.field_201.field_88[this.field_201.field_89][1]));
               } else {
                  this.field_171 = this.field_168;
                  this.method_120(var7);
               }
            }
         }

         if(this.field_169.field_261) {
            if(this.field_204) {
               this.field_169.method_184(this.field_169.field_243);
               this.field_169.field_261 = false;
               return;
            }

            this.field_169.method_180();
            return;
         }

         if(!this.field_169.field_260 && this.field_171 == 11) {
            if(this.field_201.field_89 >= 0) {
               this.field_169.method_181(this.field_201.method_39(this.field_201.field_88[this.field_201.field_89][0]), this.field_201.method_40(this.field_201.field_88[this.field_201.field_89][1]));
               return;
            }

            this.field_171 = this.field_168;
            this.method_131();
            if(this.field_168 == 21) {
               this.field_165 = 15;
               this.field_163 = this.field_170.field_234;
               this.field_164 = this.field_170.field_235 + 10;
               if(this.field_164 < 15) {
                  this.field_164 = 15;
               }

               this.field_166 = this.field_169.method_174(this.field_170);
               this.field_201.method_89(6);
               this.field_201.method_57();
               return;
            }
         }
         break;
      case 12:
         if(this.field_202 < 0) {
            this.field_202 = 3;
         } else if(--this.field_202 >= 0) {
            return;
         }

         this.field_202 = -1;
         this.field_201.arr_class_1[this.field_170.field_263].field_172[this.field_169.field_236][this.field_169.field_237] = false;
         this.field_166 = this.field_169.method_161(this.field_170);
         this.field_163 = this.field_170.field_234;
         this.field_164 = this.field_170.field_235 + 10;
         if(this.field_164 < 15) {
            this.field_164 = 15;
         }

         this.field_165 = 15;
         switch(this.field_169.field_250) {
         case 0:
            this.field_201.method_89(5);
            break;
         case 3:
            this.field_201.method_89(3);
            break;
         default:
            this.field_201.method_89(4);
         }

         if(this.field_170.field_259 > 0) {
            this.field_168 = 13;
         } else {
            this.method_133(this.field_170);
         }

         this.field_169.field_232 = false;
         this.field_171 = 14;
         if(!this.field_201.isLevelm && this.field_169.field_263 == 0) {
            this.method_97(this.field_169, this.field_166);
            return;
         }
         break;
      case 13:
         if(this.field_202 < 0) {
            this.field_202 = 3;
         } else if(--this.field_202 >= 0) {
            return;
         }

         this.field_202 = -1;
         if(this.field_169.method_162(this.field_170)) {
            this.field_166 = this.field_169.method_161(this.field_170);
            this.field_163 = this.field_170.field_234;
            this.field_164 = this.field_170.field_235 + 10;
            if(this.field_164 < 15) {
               this.field_164 = 15;
            }

            this.field_165 = 15;
            switch(this.field_169.field_250) {
            case 0:
               this.field_201.method_89(5);
               break;
            case 3:
               this.field_201.method_89(3);
               break;
            default:
               this.field_201.method_89(4);
            }

            if(this.field_170.field_259 <= 0) {
               this.method_133(this.field_170);
            }

            this.field_169.field_232 = false;
            this.field_171 = 14;
            if(!this.field_201.isLevelm && this.field_169.field_263 == 0) {
               this.method_97(this.field_169, this.field_166);
               return;
            }
         } else {
            this.method_132();
         }
         break;
      case 14:
         if(--this.field_165 <= 0) {
            this.field_171 = 15;
            return;
         }
         break;
      case 15:
         if(this.field_170.field_259 <= 0) {
            this.method_123(this.field_170);
         }

         switch(this.field_168) {
         case 10:
            this.method_132();
            break;
         case 13:
            class_3 var6 = this.field_170;
            this.field_170 = this.field_169;
            this.field_169 = var6;
            this.field_169.method_179(this.field_169.method_187(this.field_169.field_236, this.field_169.field_237, this.field_170.field_236, this.field_170.field_237));
            this.field_171 = 11;
            this.field_201.field_77 = 0;
            break;
         case 16:
            this.field_170.field_241 = 8;
            this.field_171 = this.field_168;
         }

         return;
      case 16:
         if(GameCanvas.timeMillis > this.field_174) {
            this.field_174 = GameCanvas.timeMillis + 150L;
            if(--this.field_173 < 0) {
               this.method_132();
               return;
            }
         }
      case 17:
      case 18:
      case 19:
      case 20:
      default:
         break;
      case 21:
         if(--this.field_165 <= 0) {
            this.field_169.field_232 = false;
            this.method_132();
            return;
         }
         break;
      case 22:
         if(GameCanvas.timeMillis < this.field_174) {
            return;
         }

         this.field_174 = GameCanvas.timeMillis + 150L;
         var3 = 0;

         label255:
         for(int var4 = 0; var4 < this.field_196; ++var4) {
            if(this.field_194[var4] >= 0) {
               var3 += this.field_194[var4];
               if(this.field_194[var4]-- == this.field_195) {
                  this.field_201.method_51(this.field_193[var4][0], this.field_193[var4][1]);
                  int var5 = 0;

                  while(true) {
                     if(var5 >= this.field_201.field_86) {
                        break label255;
                     }

                     if(this.field_201.field_arr_class3_1[var5].field_236 == this.field_193[var4][0] && this.field_201.field_arr_class3_1[var5].field_237 == this.field_193[var4][1]) {
                        this.method_123(this.field_201.field_arr_class3_1[var5]);
                     }

                     ++var5;
                  }
               }
            }
         }

         if(var3 <= 0) {
            if(this.field_161 < 0) {
               this.method_130(this.field_159);
               this.field_161 = this.field_159;
               if(this.field_161 >= 0 && this.field_201.field_arr_class3_1[this.field_161].field_242) {
                  this.field_161 = -1;
               }
            }

            this.method_132();
            return;
         }
         break;
      case 23:
         this.field_201.field_class5.method_203(90 + this.field_188, 140, 0);
         this.field_171 = 33;
         return;
      case 24:
         this.field_182 += this.field_187 * this.field_186;
         if(this.field_182 / this.field_201.field_58 == this.field_180) {
            return;
         }

         int var1 = this.field_201.method_42(this.field_184);
         this.field_180 = this.field_201.method_42(this.field_182);
         this.field_201.field_77 = 0;
         if(this.method_127(this.field_179, this.field_180)) {
            return;
         }

         class_1 var2;
         if((var2 = this.method_122()).field_178 == 1 && (this.field_178 != 1 || GameCanvas.method_2(2) != 0) && var2.method_126(this.field_198)) {
            return;
         }

         if(this.field_178 == 0) {
            this.method_121(this.field_179, this.field_180, 4);
         } else if(this.field_178 == 1 && this.method_126(this.field_198)) {
            return;
         }

         if(var1 == this.field_180) {
            this.field_201.method_30(this.field_201.method_39(this.field_179), this.field_201.method_40(this.field_180));
            if(this.field_178 == 2 && this.field_180 > 0 && this.field_180 < this.field_201.mapRows - 1) {
               this.field_201.method_89(8);
               this.field_171 = 22;
               this.method_121(this.field_179, this.field_180, 4);

               for(var3 = 0; var3 < this.field_196; ++var3) {
                  this.field_193[var3][0] = this.field_201.method_37(this.field_179 + GameCanvas.method_2(4) - 2);
                  this.field_193[var3][1] = this.field_201.method_38(this.field_180 + GameCanvas.method_2(4) - 2);
                  this.field_194[var3] = this.field_195;
                  this.method_101(this.field_193[var3][0], this.field_193[var3][1]);
               }

               return;
            }
         } else if(this.field_180 != this.field_199) {
            return;
         }

         this.method_132();
         return;
      case 25:
         if(this.field_162 && this.field_201.method_32(this.field_201.field_arr_class3_1[this.field_201.field_136].field_236, this.field_201.field_arr_class3_1[this.field_201.field_136].field_237) == 0) {
            this.method_134();
            this.field_171 = 10;
            return;
         }
         break;
      case 26:
         this.field_201.field_class5.method_203(86 + this.field_188, 140, 0);
         this.field_171 = 33;
         return;
      case 27:
         this.method_100(this.field_152, this.field_153);
         this.field_201.method_89(10);
         this.field_169.field_248 = 0;
         this.field_171 = 10;
         this.method_131();
         this.field_169.field_232 = false;
         return;
      case 28:
         this.method_101(this.field_152, this.field_153);
         this.field_169.field_248 = 0;
         if(this.field_169.field_250 != 4) {
            this.field_201.method_51(this.field_152, this.field_153);
            this.field_170 = this.field_169;
            this.field_163 = this.field_170.field_234;
            this.field_164 = this.field_170.field_235 + 10;
            if(this.field_164 < 15) {
               this.field_164 = 15;
            }

            this.field_165 = 15;
            this.field_166 = 90 + GameCanvas.method_2(90);
            if((this.field_170.field_259 -= this.field_166) < 0) {
               this.method_123(this.field_170);
            }

            this.field_173 = 3;
            this.field_154 = this.field_152;
            this.field_155 = this.field_153;
            this.field_171 = 30;
            this.field_201.method_89(8);
         } else {
            this.field_171 = 10;
            this.field_201.method_89(10);
         }

         this.method_131();
         this.field_169.field_232 = false;
         return;
      case 29:
         this.field_169.method_167(this.field_152, this.field_153);
         this.field_201.method_89(6);
         this.field_169.field_248 = 0;
         this.field_171 = 10;
         this.method_131();
         this.field_169.field_232 = false;
         return;
      case 30:
         if(this.field_173 >= 0 && GameCanvas.timeMillis > this.field_174) {
            this.field_174 = GameCanvas.timeMillis + 150L;
            --this.field_173;
         }

         if(this.field_165 >= 0) {
            --this.field_165;
         }

         if(this.field_173 < 0 && this.field_165 < 0) {
            this.method_132();
            return;
         }
         break;
      case 31:
         this.field_201.field_class5.method_203(89, 140, 0);
         this.field_171 = 33;
         return;
      case 32:
         if(this.field_192 < GameCanvas.timeMillis) {
            this.field_171 = 14;
            return;
         }
         break;
      case 33:
         if(this.field_162) {
            if(this.field_201.method_32(this.field_201.method_41(this.field_189), this.field_201.method_42(this.field_190)) == 0) {
               this.method_134();
               this.field_192 = GameCanvas.timeMillis + this.field_191;
               return;
            }
         } else if(this.field_192 < GameCanvas.timeMillis) {
            this.method_132();
            if(!this.field_200) {
               this.method_125();
               return;
            }
         }
      }

   }

   // $FF: renamed from: a () boolean
   public boolean method_105() {
      this.method_121(this.field_201.method_41(this.field_169.field_234), this.field_201.method_42(this.field_169.field_235), this.field_169.field_252);
      this.method_110(this.field_169);
      if(!this.method_102(this.field_169.field_236, this.field_169.field_237) && !this.method_122().method_102(this.field_169.field_236, this.field_169.field_237)) {
         this.method_106(this.field_169);
         int var1;
         return (var1 = this.field_201.field_89 - 1) >= 0 && this.field_201.method_56(this.field_201.field_88[var1][0], this.field_201.field_88[var1][1]) != null;
      } else {
         this.field_201.method_51(this.field_169.field_236, this.field_169.field_237);
         this.field_170 = this.field_169;
         this.field_163 = this.field_170.field_234;
         this.field_164 = this.field_170.field_235 + 10;
         if(this.field_164 < 15) {
            this.field_164 = 15;
         }

         this.field_165 = 15;
         this.field_166 = 90 + GameCanvas.method_2(90);
         if((this.field_170.field_259 -= this.field_166) < 0) {
            this.method_123(this.field_170);
            this.method_131();
         }

         this.field_173 = 3;
         this.field_154 = this.field_170.field_236;
         this.field_155 = this.field_170.field_237;
         this.field_168 = 30;
         this.method_101(this.field_169.field_236, this.field_169.field_237);
         this.method_122().method_101(this.field_169.field_236, this.field_169.field_237);
         return true;
      }
   }

   // $FF: renamed from: a (b) void
   public void method_106(class_3 var1) {
      for(int var2 = this.field_201.field_87; var2 < this.field_201.field_86; ++var2) {
         if(Math.abs(this.field_201.field_arr_class3_1[var2].field_236 - var1.field_236) <= 1 && Math.abs(this.field_201.field_arr_class3_1[var2].field_237 - var1.field_237) <= 1) {
            class_3 var3 = this.field_201.field_arr_class3_1[var2];

            for(int var4 = var2 - 1; var4 >= this.field_159 + this.field_160; --var4) {
               this.field_201.field_arr_class3_1[var4 + 1] = this.field_201.field_arr_class3_1[var4];
            }

            var3.field_263 = var1.field_263;
            var3.field_248 = 0;
            this.field_201.field_arr_class3_1[this.field_159 + this.field_160] = var3;
            class_1 var5 = this.method_122();
            if(this.field_159 == 0) {
               ++var5.field_159;
               var5.method_131();
            }

            ++this.field_160;
            ++this.field_201.field_87;
         }
      }

   }

   // $FF: renamed from: a () int
   public int method_107() {
      this.field_204 = false;
      this.field_203 = 0;
      this.field_200 = false;

      for(int var1 = this.field_159; var1 < this.field_159 + this.field_160; ++var1) {
         this.field_201.field_arr_class3_1[var1].method_188();
      }

      if(this.field_161 < 0) {
         this.method_130(this.field_159);
      } else {
         this.method_130(this.field_161);
      }

      this.field_161 = this.field_159;
      this.field_201.method_57();
      if(this.field_201.field_arr_class3_1[this.field_159].field_242) {
         this.method_131();
      }

      this.method_111();
      this.method_108(this.field_161);
      if(this.field_171 != 23 && this.field_171 != 26 && this.field_171 != 31) {
         this.method_125();
         return this.field_161;
      } else {
         this.field_162 = true;
         return this.field_161;
      }
   }

   // $FF: renamed from: d (int) void
   public final void method_108(int var1) {
      this.method_134();
      if(this.field_161 >= 0) {
         this.field_201.method_30(this.field_201.field_arr_class3_1[var1].field_234, this.field_201.field_arr_class3_1[var1].field_235);
         this.field_162 = true;
      }

      this.field_201.method_77();
   }

   // $FF: renamed from: h () void
   public final void method_109() {
      int var1 = this.field_161;
      if(this.field_161 < 0) {
         int var2 = Integer.MAX_VALUE;

         for(int var4 = this.field_159; var4 < this.field_159 + this.field_160; ++var4) {
            int var3;
            if(!this.field_201.field_arr_class3_1[var4].field_242 && this.field_201.field_arr_class3_1[var4].field_232 && (var3 = this.field_201.field_arr_class3_1[var4].method_175(this.field_201.method_41(this.field_201.field_75), this.field_201.method_41(this.field_201.field_76))) < var2) {
               var2 = var3;
               var1 = var4;
            }
         }

         --var1;
      } else if(var1 >= 0 && this.field_201.field_arr_class3_1[var1].field_248 < this.field_201.field_arr_class3_1[var1].field_258) {
         this.field_201.field_arr_class3_1[var1].field_232 = false;
      }

      this.field_201.method_57();
      this.field_162 = true;
      this.field_161 = this.method_119(var1);
      this.field_201.method_77();
      this.field_201.field_77 = 1;
   }

   // $FF: renamed from: b (b) void
   public final void method_110(class_3 var1) {
      if(!var1.field_242 && var1.field_250 == 4) {
         class_1 var2 = this.method_122();

         for(int var3 = 0; var3 < 15; ++var3) {
            if(!var2.field_150[var3]) {
               int var4 = var2.field_149[var3][0];
               int var5 = var2.field_149[var3][1];
               if(!this.field_172[var4][var5] && var1.method_175(var4, var5) <= var1.field_252 * var1.field_252) {
                  var2.field_151[var3] = true;
               }
            }
         }
      }

   }

   // $FF: renamed from: i () void
   public final void method_111() {
      for(int var1 = this.field_159; var1 < this.field_159 + this.field_160; ++var1) {
         class_3 var2 = this.field_201.field_arr_class3_1[var1];
         this.method_110(var2);
      }

   }

   // $FF: renamed from: b (int, int) boolean
   public final boolean method_112(int var1, int var2) {
      for(int var3 = this.field_159; var3 < this.field_159 + this.field_160; ++var3) {
         if(this.field_201.field_arr_class3_1[var3].field_236 == var1 && this.field_201.field_arr_class3_1[var3].field_237 == var2 && !this.field_201.field_arr_class3_1[var3].field_242) {
            if(var3 == this.field_161) {
               this.field_201.field_arr_class3_1[var3].field_232 = false;
               this.method_131();
               this.field_201.method_77();
               return true;
            }

            if(this.field_161 >= 0) {
               this.field_201.method_57();
            }

            this.method_130(var3);
            this.field_161 = this.field_159;
            this.field_201.method_63(this.field_161, true);
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (int, int, int) void
   public final void method_113(int var1, int var2, int var3) {
      this.field_171 = 11;
      this.field_168 = var1;
      this.field_152 = var2;
      this.field_153 = var3;
      this.field_169.method_179(this.field_169.method_187(this.field_169.field_236, this.field_169.field_237, var2, var3));
   }

   // $FF: renamed from: c (int, int) void
   public final void method_114(int var1, int var2) {
      if(!this.method_112(var1, var2)) {
         this.method_131();
      }

      this.method_132();
   }

   // $FF: renamed from: a (short) void
   public void method_115(short var1) {
      if(!this.field_162 && this.field_171 != 11) {
         this.field_201.method_28(var1);
         int var2 = this.field_201.method_47();
         int var3 = this.field_201.method_48();
         if(this.field_171 == 32) {
            this.field_192 = 0L;
         } else if(this.field_171 == 33) {
            this.field_192 = 0L;
         } else {
            if((var1 & 16) != 0 && !this.field_162) {
               switch(this.field_171) {
               case 10:
                  if(this.method_112(var2, var3)) {
                     this.field_201.method_77();
                     return;
                  }

                  if(this.field_161 >= 0) {
                     class_3 var6 = this.field_201.field_arr_class3_1[this.field_161];
                     this.field_201.field_116 = true;
                     class_3 var7 = this.field_201.method_56(var2, var3);
                     this.field_201.field_116 = false;
                     int var9;
                     if(var7 == null) {
                        if(this.field_201.method_58(var2, var3) == -1) {
                           var6.method_179(var6.method_187(var6.field_236, var6.field_237, var2, var3));
                           this.field_201.method_57();
                           this.field_171 = 11;
                           this.field_169 = var6;
                           this.field_168 = 10;
                           return;
                        }

                        this.field_201.method_61(var2, var3);
                        --this.field_201.field_89;
                        var6.method_179(var6.method_187(var6.field_236, var6.field_237, this.field_201.field_88[this.field_201.field_89][0], this.field_201.field_88[this.field_201.field_89][1]));
                        this.field_171 = 11;
                        this.field_169 = var6;
                        var9 = var6.field_250;
                        if(var6.field_250 != 0 && var9 != 3) {
                           this.field_201.method_89(9);
                        }

                        this.field_168 = 10;
                        this.field_201.field_77 = 0;
                        return;
                     }

                     class_1 var8;
                     for(var9 = (var8 = this.method_122()).field_159; var9 < var8.field_159 + var8.field_160; ++var9) {
                        if(!this.field_172[this.field_201.field_arr_class3_1[var9].field_236][this.field_201.field_arr_class3_1[var9].field_237] && this.field_201.field_arr_class3_1[var9].field_236 == var2 && this.field_201.field_arr_class3_1[var9].field_237 == var3 && !this.field_201.field_arr_class3_1[var9].field_242) {
                           this.field_169 = var6;
                           this.field_201.method_57();
                           this.field_170 = this.field_201.field_arr_class3_1[var9];
                           var6.method_179(var6.method_187(var6.field_236, var6.field_237, this.field_170.field_236, this.field_170.field_237));
                           this.field_171 = 11;
                           if(!this.field_201.field_arr_class3_1[var9].field_242 && var6.method_162(this.field_201.field_arr_class3_1[var9])) {
                              this.field_168 = 12;
                              this.field_201.field_77 = 2;
                           } else {
                              this.field_168 = 10;
                              this.field_201.field_77 = 0;
                           }
                        }
                     }
                  }
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               default:
                  break;
               case 17:
                  if(this.field_169.method_165(var2, var3)) {
                     this.method_113(27, var2, var3);
                     return;
                  }

                  this.method_114(var2, var3);
                  return;
               case 18:
                  if(this.field_169.method_170(var2, var3)) {
                     this.method_113(28, var2, var3);
                     return;
                  }

                  this.method_114(var2, var3);
                  return;
               case 19:
                  if(this.field_169.method_168(var2, var3)) {
                     this.method_113(29, var2, var3);
                     return;
                  }

                  this.method_114(var2, var3);
                  return;
               case 20:
                  this.field_170 = this.field_201.method_56(var2, var3);
                  if(this.field_170 == null) {
                     this.method_114(var2, var3);
                     return;
                  }

                  if(this.field_169.method_172(this.field_170.field_236, this.field_170.field_237)) {
                     this.field_165 = 15;
                     this.method_113(21, var2, var3);
                     return;
                  }

                  this.method_114(var2, var3);
                  return;
               }
            }

         }
      }
   }

   // $FF: renamed from: c (b, int) void
   public final void method_116(class_3 var1, int var2) {
      this.field_171 = var2;
      this.field_169 = var1;
   }

   // $FF: renamed from: b (short) void
   public void method_117(short var1) {
      this.field_201.field_64 = var1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, javax.microedition.lcdui.Image[]) void
   public void method_118(Graphics var1, Image[] var2) {
      var1.setClip(0, 0, 240, 320);
      switch(this.field_171) {
      case 10:
         if(this.field_201.field_38 == this.field_167) {
            this.field_201.method_84(var1, this.field_201.field_96);
            this.field_201.method_83(var1, this.field_201.field_97);
            return;
         }
         break;
      case 11:
         if(this.field_167 == this.field_201.field_38 && this.field_169.field_260 && this.field_169.field_246 != 1 && this.field_169.field_246 != 0 && this.field_169.field_246 != 10 && this.field_169.field_246 != 9) {
            var1.drawImage(var2[257 + this.field_203 % 3], this.field_169.field_234 - this.field_201.field_59 - class_3.field_229[this.field_169.field_247][0] * this.field_201.field_57, this.field_169.field_235 - this.field_201.field_60 - class_3.field_229[this.field_169.field_247][1] * this.field_201.field_58, 0);
            return;
         }
         break;
      case 13:
         if(!this.field_169.method_162(this.field_170)) {
            return;
         }
      case 12:
         var1.drawImage(var2[126 + (this.field_202 + 5) % 3], this.field_201.method_43(this.field_169.field_236 + class_3.field_229[this.field_169.field_247][0]), this.field_201.method_44(this.field_169.field_237 + class_3.field_229[this.field_169.field_247][1]), 0);
         return;
      case 14:
         var1.setColor(3158016);
         var1.drawString("" + this.field_166, this.field_163 - this.field_201.field_59 + 1, this.field_164 - 30 + this.field_165 - this.field_201.field_60 + 1, 0);
         var1.setColor(16777088);
         var1.drawString("" + this.field_166, this.field_163 - this.field_201.field_59, this.field_164 - 30 + this.field_165 - this.field_201.field_60, 0);
         return;
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 31:
      default:
         break;
      case 16:
         var1.drawImage(var2[121 + this.field_173 % 3], this.field_201.method_43(this.field_170.field_236) + this.field_201.field_78, this.field_201.method_44(this.field_170.field_237) + this.field_201.field_79, 3);
         return;
      case 21:
         var1.setColor(3158016);
         var1.drawString("+" + this.field_166, this.field_163 - this.field_201.field_59 + 1, this.field_164 - 30 + this.field_165 - this.field_201.field_60 + 1, 0);
         var1.setColor(16777088);
         var1.drawString("+" + this.field_166, this.field_163 - this.field_201.field_59 + 1, this.field_164 - 30 + this.field_165 - this.field_201.field_60 + 1, 0);
         return;
      case 22:
         for(int var3 = 0; var3 < this.field_196; ++var3) {
            if(this.field_194[var3] > 0 && this.field_194[var3] < this.field_195) {
               var1.drawImage(var2[121 + this.field_194[var3] % 3], this.field_201.method_43(this.field_193[var3][0]) + this.field_201.field_78, this.field_201.method_44(this.field_193[var3][1]) + this.field_201.field_79, 3);
            }
         }

         return;
      case 30:
         if(this.field_165 >= 0) {
            var1.setColor(3158016);
            var1.drawString("" + this.field_166, this.field_163 - this.field_201.field_59 + 1, this.field_164 - 30 + this.field_165 - this.field_201.field_60 + 1, 0);
            var1.setColor(16777088);
            var1.drawString("" + this.field_166, this.field_163 - this.field_201.field_59, this.field_164 - 30 + this.field_165 - this.field_201.field_60, 0);
         }

         if(this.field_173 >= 0) {
            var1.drawImage(var2[121 + this.field_173 % 3], this.field_201.method_43(this.field_154), this.field_201.method_44(this.field_155), 0);
            return;
         }
         break;
      case 32:
         this.field_201.method_76(var1, 120, 160);
         return;
      case 33:
         if(!this.field_162 && this.field_167 == this.field_201.field_38) {
            this.field_201.method_76(var1, 120, 160);
         }
      }

   }

   // $FF: renamed from: a (int) int
   public final int method_119(int var1) {
      int var2 = var1;
      int var3 = 0;
      if(var1 < this.field_159 || var1 >= this.field_160 + this.field_159) {
         var2 = this.field_159 - 1;
      }

      do {
         if(var3++ >= this.field_160) {
            return -1;
         }

         ++var2;
         if(var2 >= this.field_160 + this.field_159) {
            var2 = this.field_159;
         }
      } while(this.field_201.field_arr_class3_1[var2].field_242 || !this.field_201.field_arr_class3_1[var2].field_232);

      return var2;
   }

   // $FF: renamed from: a (boolean) void
   public void method_120(boolean var1) {
      this.field_201.method_57();
      if(this.field_161 >= 0) {
         this.field_201.method_63(this.field_161, true);
         if(this.field_169.field_258 > this.field_169.field_248 && this.field_201.method_58(this.field_169.field_236 - 1, this.field_169.field_237) == -1 && this.field_201.method_58(this.field_169.field_236 + 1, this.field_169.field_237) == -1 && this.field_201.method_58(this.field_169.field_236, this.field_169.field_237 - 1) == -1 && this.field_201.method_58(this.field_169.field_236, this.field_169.field_237 + 1) == -1) {
            this.field_169.field_232 = false;
         }
      }

      this.field_201.field_89 = -1;
      if(this.field_168 == 21) {
         this.field_165 = 15;
         this.field_169.method_174(this.field_170);
         this.field_201.method_89(6);
      }

      this.field_201.method_77();
   }

   // $FF: renamed from: b (int, int, int) void
   public final void method_121(int var1, int var2, int var3) {
      if(var3 >= 0 && this.field_201.method_49(var1, var2)) {
         this.field_172[var1][var2] = false;
         --var3;
         this.method_121(var1 - 1, var2, var3);
         this.method_121(var1 + 1, var2, var3);
         this.method_121(var1, var2 - 1, var3);
         this.method_121(var1, var2 + 1, var3);
      }
   }

   // $FF: renamed from: a () e
   public final class_1 method_122() {
      return this.field_201.arr_class_1[0] != this?this.field_201.arr_class_1[0]:this.field_201.arr_class_1[1];
   }

   // $FF: renamed from: c (b) void
   public final void method_123(class_3 var1) {
      if(var1.field_250 == 0) {
         this.field_201.method_89(11);
      } else {
         this.field_201.method_89(8);
      }

      if(this.field_161 >= 0 && var1 == this.field_201.field_arr_class3_1[this.field_161]) {
         this.method_131();
      }

      var1.method_189();
   }

   // $FF: renamed from: c (int, int, int) void
   public final void method_124(int var1, int var2, int var3) {
      this.field_179 = this.field_201.method_41(var1);
      this.field_177 = 0;
      if(this.field_167 == 0) {
         this.field_180 = this.field_201.mapRows - 1;
         this.field_187 = -1;
      } else {
         this.field_180 = 0;
         this.field_187 = 1;
      }

      this.field_183 = var1;
      this.field_184 = var2;
      this.field_178 = var3;
      int var4;
      if(this.field_178 == 2) {
         for(var4 = 0; var4 < this.field_196; ++var4) {
            this.field_193[var4][0] = this.field_193[var4][1] = 0;
         }
      }

      if(this.field_201.method_42(this.field_184) == this.field_180 && this.field_178 == 2) {
         this.field_201.method_89(8);
         this.field_171 = 22;
         this.method_121(this.field_179, this.field_180, 4);

         for(var4 = 0; var4 < this.field_196; ++var4) {
            this.field_193[var4][0] = this.field_201.method_37(this.field_179 + GameCanvas.method_2(4) - 2);
            this.field_193[var4][1] = this.field_201.method_38(this.field_180 + GameCanvas.method_2(4) - 2);
            this.field_194[var4] = this.field_195;
            this.method_101(this.field_193[var4][0], this.field_193[var4][1]);
         }
      }

      this.field_181 = this.field_183;
      this.field_182 = this.field_201.method_40(this.field_180);
      class_1 var5;
      (var5 = this.method_122()).field_189 = this.field_181;
      var5.field_190 = this.field_182;
      var5.field_171 = 31;
   }

   // $FF: renamed from: j () void
   public final void method_125() {
      this.field_200 = false;
      if(this.field_197 > 0) {
         --this.field_197;
      } else if(this.field_178 >= 0) {
         int var1 = this.field_201.method_42(this.field_184);
         this.field_199 = this.field_180 + this.field_185 * this.field_187;
         this.field_201.method_30(this.field_201.method_39(this.field_179), this.field_201.method_40(this.field_180));
         if(var1 == this.field_180) {
            if(++this.field_177 <= this.field_175[this.field_178]) {
               if(this.field_178 == 0) {
                  this.method_121(this.field_179, this.field_180, 4 + this.field_177);
               } else if(this.field_178 == 1) {
                  this.method_126(this.field_198);
               }

               this.method_127(this.field_179, this.field_180);
               return;
            }

            if(this.field_180 <= 0 || this.field_180 >= this.field_201.mapRows - 1) {
               this.field_178 = -1;
               return;
            }

            if(this.field_187 > 0) {
               this.field_184 = this.field_201.method_40(0);
            } else {
               this.field_184 = this.field_201.method_40(this.field_201.mapRows - 1);
            }

            this.field_187 = -this.field_187;
            this.field_199 = this.field_180 + this.field_185 * this.field_187;
         }

         this.field_201.method_30(this.field_181, this.field_201.method_40(this.field_180 + this.field_185 * this.field_187 / 2));
         this.field_201.field_77 = 0;
         this.field_171 = 24;
      }
   }

   // $FF: renamed from: a (int) boolean
   public final boolean method_126(int var1) {
      class_1 var2;
      if((var2 = this.method_122()).field_178 >= 0) {
         int var3 = this.field_181 - var2.field_181;
         int var4 = this.field_182 - var2.field_182;
         if(var3 * var3 + var4 * var4 < var1) {
            this.method_128(var2.field_178, var2.field_181, var2.field_182);
            var2.method_129();
            this.field_201.field_class5.method_203(86 + this.field_188, 140, 0);
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: c (int, int) boolean
   public final boolean method_127(int var1, int var2) {
      class_1 var3;
      for(int var4 = (var3 = this.method_122()).field_159; var4 < var3.field_159 + var3.field_160; ++var4) {
         if(!this.field_201.field_arr_class3_1[var4].field_242 && (this.field_201.field_arr_class3_1[var4].field_246 == 10 || this.field_201.field_arr_class3_1[var4].field_246 == 9) && this.field_201.field_arr_class3_1[var4].method_175(var1, var2) <= this.field_201.field_arr_class3_1[var4].field_254 * this.field_201.field_arr_class3_1[var4].field_254) {
            this.field_201.field_arr_class3_1[var4].method_185(this.field_201.field_arr_class3_1[var4].field_236, this.field_201.field_arr_class3_1[var4].field_237, this.field_201.method_41(this.field_181), this.field_201.method_42(this.field_182));
            this.field_172[this.field_201.field_arr_class3_1[var4].field_236][this.field_201.field_arr_class3_1[var4].field_237] = false;
            this.field_201.method_30(this.field_201.field_arr_class3_1[var4].field_234, this.field_201.field_arr_class3_1[var4].field_235);
            var3.method_128(this.field_178, this.field_181, this.field_182);
            this.method_129();
            this.field_201.field_class5.method_203(90 + this.field_188, 140, 0);
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: d (int, int, int) void
   public final void method_128(int var1, int var2, int var3) {
      this.field_171 = 26;
      this.field_188 = var1;
      this.field_189 = var2;
      this.field_190 = var3;
      this.method_122().field_197 = 4;
      this.field_162 = true;
   }

   // $FF: renamed from: e () void
   public void method_129() {
      this.field_188 = this.field_178;
      this.field_189 = this.field_181;
      this.field_190 = this.field_182;
      this.field_171 = 23;
      this.field_178 = -1;
      this.field_197 = 4;
      this.field_162 = true;
   }

   // $FF: renamed from: e (int) void
   public final void method_130(int var1) {
      if(this.field_201.field_arr_class3_1[var1].field_242) {
         var1 = this.method_119(var1);
      }

      if(var1 >= 0) {
         class_3 var2;
         if(var1 != this.field_159) {
            var2 = this.field_201.field_arr_class3_1[this.field_159];
            this.field_201.field_arr_class3_1[this.field_159] = this.field_201.field_arr_class3_1[var1];
            this.field_201.field_arr_class3_1[var1] = var2;
         }

         for(int var6 = this.field_159; var6 < this.field_159 + this.field_160 - 1; ++var6) {
            int var3 = Integer.MAX_VALUE;
            int var5 = -1;

            for(int var7 = var6 + 1; var7 < this.field_159 + this.field_160; ++var7) {
               int var4;
               if(!this.field_201.field_arr_class3_1[var7].field_242 && (var4 = this.field_201.field_arr_class3_1[var6].method_175(this.field_201.field_arr_class3_1[var7].field_236, this.field_201.field_arr_class3_1[var7].field_237)) < var3) {
                  var3 = var4;
                  var5 = var7;
               }
            }

            if(var5 < 0) {
               return;
            }

            var2 = this.field_201.field_arr_class3_1[var6 + 1];
            this.field_201.field_arr_class3_1[var6 + 1] = this.field_201.field_arr_class3_1[var5];
            this.field_201.field_arr_class3_1[var5] = var2;
         }

      }
   }

   // $FF: renamed from: k () void
   public final void method_131() {
      this.field_161 = -1;
      this.field_201.method_57();
      this.field_201.method_77();
   }

   // $FF: renamed from: l () void
   public final void method_132() {
      this.field_201.field_77 = 1;
      this.field_162 = true;
      this.field_171 = 10;
   }

   // $FF: renamed from: d (b) void
   public final void method_133(class_3 var1) {
      if(var1.field_246 != 1 && var1.field_246 != 0) {
         this.field_173 = 10;
         this.field_168 = 16;
         this.field_154 = var1.field_236;
         this.field_155 = var1.field_237;
      } else {
         this.field_168 = 10;
      }

      this.field_201.field_77 = 0;
   }

   // $FF: renamed from: m () void
   public final void method_134() {
      this.field_201.method_30(this.field_201.method_45(this.field_201.field_75), this.field_201.method_46(this.field_201.field_76));
      this.field_162 = false;
      this.field_201.field_64 = this.field_201.field_63 = 0;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_156 = new int[][]{{150, 375, 938, 2344, 5859}, {700, 1750, 4375, 10938, 27344}, {1000, 2500, 6250, 15625, '\u9897'}, {2000, 5000, 12500, 31250, 78125}};
   }
}
