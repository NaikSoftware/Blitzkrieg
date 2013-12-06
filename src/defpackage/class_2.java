package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: d
public final class class_2 extends class_1 {

   // $FF: renamed from: a b
   public class_3 field_205;
   // $FF: renamed from: a java.util.Vector
   public Vector field_206;
   // $FF: renamed from: b java.util.Vector
   public Vector field_207;
   // $FF: renamed from: a int[]
   public int[] field_208;
   // $FF: renamed from: b int[]
   public int[] field_209;
   // $FF: renamed from: c int[]
   public int[] field_210;
   // $FF: renamed from: a int[][]
   public int[][] field_211;
   // $FF: renamed from: d int[]
   public int[] field_212;
   // $FF: renamed from: a java.util.Vector[]
   public Vector[] field_213;
   // $FF: renamed from: a b[]
   public class_3[] field_214;
   // $FF: renamed from: b int[][]
   public int[][] field_215;
   // $FF: renamed from: a int
   public int field_216;
   // $FF: renamed from: b int
   public int field_217;
   // $FF: renamed from: a byte[][]
   public static /*final*/ byte[][] field_218;


   // $FF: renamed from: <init> () void
   // method 98
   public class_2() {
      super();//?
      this.field_206 = new Vector(10);
      this.field_207 = new Vector(10);
      this.field_208 = new int[13];
      this.field_209 = new int[13];
      this.field_210 = new int[13];
      this.field_211 = new int[13][2];
      this.field_212 = new int[13];
      this.field_213 = new Vector[13];
      this.field_214 = new class_3[13];
      this.field_215 = new int[13][5];

      for(int var1 = 0; var1 < 13; ++var1) {
         this.field_213[var1] = new Vector(5);
      }

   }

   // $FF: renamed from: a (int, int, short) void
   public final void method_136(int var1, int var2, short var3) {
      super.method_99(var1, var2, var3, true);
      this.method_137();
      this.method_138();
      if(super.field_201.field_106 > 1) {
         for(int var4 = 0; var4 < 4; ++var4) {
            super.field_158[var4] = 1;
         }
      }

   }

   // $FF: renamed from: a () void
   public final void method_137() {
      this.field_206.removeAllElements();
      this.field_207.removeAllElements();

      for(int var1 = 0; var1 < 13; ++var1) {
         this.field_208[var1] = 2;
         this.field_209[var1] = 2;
         this.field_213[var1].removeAllElements();
         this.field_215[var1][0] = 0;
         this.field_214[var1] = null;
      }

   }

   // $FF: renamed from: b () void
   public final void method_138() {
      for(int var1 = 0; var1 < super.field_160; ++var1) {
         this.field_214[var1] = super.field_201.field_arr_class3_1[super.field_159 + var1];
      }

   }

   // $FF: renamed from: a (int) void
   public final void method_139(int var1) {
      if(this.field_215[var1][0] <= 0) {
         this.field_215[var1][0] = this.field_208[var1];
         switch(this.field_208[var1]) {
         case 5:
         case 6:
         case 7:
            this.field_215[var1][3] = this.field_210[var1];
            this.field_215[var1][4] = this.field_212[var1];
         case 3:
         case 4:
         case 8:
            this.field_215[var1][1] = this.field_211[var1][0];
            this.field_215[var1][2] = this.field_211[var1][1];
         }
      }

   }

   // $FF: renamed from: b (int) void
   public final void method_140(int var1) {
      int var2;
      if((var2 = this.field_215[var1][0]) > 0) {
         this.field_208[var1] = var2;
         switch(var2) {
         case 5:
         case 6:
         case 7:
            this.field_210[var1] = this.field_215[var1][3];
            this.field_212[var1] = this.field_215[var1][4];
         case 3:
         case 4:
         case 8:
            this.field_211[var1][0] = this.field_215[var1][1];
            this.field_211[var1][1] = this.field_215[var1][2];
         }
      } else {
         this.field_208[var1] = 2;
      }

      this.field_215[var1][0] = 0;
   }

   // $FF: renamed from: a (int[]) void
   public final void method_141(int[] var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < this.field_206.size(); ++var3) {
         if(((int[])this.field_206.elementAt(var3))[3] >= var1[3]) {
            this.field_206.insertElementAt(var1, var3);
            var2 = true;
            break;
         }
      }

      if(!var2) {
         this.field_206.addElement(var1);
      }

   }

   // $FF: renamed from: a (int, int, b, boolean) int
   public final int method_142(int var1, int var2, class_3 var3, boolean var4) {
      int var5;
      if((var5 = super.field_201.method_68(var1, var2, var4)) == 100 && var3.field_250 != 0) {
         var5 = 1000;
      }

      return super.field_201.method_70(var3, var5, var1, var2);
   }

   // $FF: renamed from: a (java.util.Vector, int, int) int[]
   public final int[] method_143(Vector var1, int var2, int var3) {
      for(int var4 = var1.size() - 1; var4 >= 0; --var4) {
         int[] var5;
         if((var5 = (int[])var1.elementAt(var4))[0] == var2 && var5[1] == var3) {
            return var5;
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.util.Vector, int, int, int) boolean
   public final boolean method_144(Vector var1, int var2, int var3, int var4) {
      int[] var5;
      return (var5 = this.method_143(var1, var2, var3)) == null?false:var5[2] <= var4;
   }

   // $FF: renamed from: a (int, int, int, int, b, boolean) boolean
   public final boolean method_145(int var1, int var2, int var3, int var4, class_3 var5, boolean var6) {
      int[] var7;
      (var7 = new int[5])[0] = var1;
      var7[1] = var2;
      var7[3] = 0;
      var7[2] = 0;
      var7[4] = -1;
      this.field_206.removeAllElements();
      this.field_207.removeAllElements();
      this.method_141(var7);
      int var8 = 0;

      while(this.field_206.size() > 0) {
         int[] var9 = (int[])this.field_206.elementAt(0);
         this.field_206.removeElement(var9);
         ++var8;
         if(var8 > 200) {
            this.field_207.removeAllElements();
            this.field_206.removeAllElements();
            return false;
         }

         if(var9[0] == var3 && var9[1] == var4) {
            this.field_207.addElement(var9);
            return true;
         }

         for(int var10 = 6; var10 >= 0; var10 -= 2) {
            int var11 = var9[0] + class_3.field_229[var10][0];
            int var12 = var9[1] + class_3.field_229[var10][1];
            int var13;
            if((var13 = var9[2] + this.method_142(var11, var12, var5, var6)) - var9[2] < 250 && !this.method_144(this.field_206, var11, var12, var13) && !this.method_144(this.field_207, var11, var12, var13)) {
               int[] var14;
               (var14 = new int[5])[0] = var11;
               var14[1] = var12;
               var14[2] = var13;
               var14[3] = var13 + 10 * (Math.abs(var11 - var3) + Math.abs(var12 - var4));
               var14[4] = this.field_207.size();
               int[] var15;
               if((var15 = this.method_143(this.field_206, var11, var12)) != null) {
                  if(var15[2] > var13) {
                     this.field_206.removeElement(var15);
                     this.method_141(var14);
                  }
               } else {
                  this.method_141(var14);
               }
            }
         }

         this.field_207.addElement(var9);
      }

      this.field_207.removeAllElements();
      this.field_206.removeAllElements();
      return false;
   }

   // $FF: renamed from: a (java.util.Vector) void
   public final void method_146(Vector var1) {
      int var2 = this.field_207.size() - 1;

      int[] var3;
      do {
         var3 = (int[])this.field_207.elementAt(var2);
         var1.addElement(var3);
      } while((var2 = var3[4]) != -1);

      var1.removeElementAt(var1.size() - 1);
   }

   // $FF: renamed from: a (b, b) void
   public final void method_147(class_3 var1, class_3 var2) {
      for(int var3 = 0; var3 < super.field_160; ++var3) {
         class_3 var4;
         int var5;
         if(!(var4 = this.field_214[var3]).field_242 && ((var5 = this.field_208[var3]) == 2 || (var5 == 4 || var5 == 1) && var1.method_175(var4.field_236, var4.field_237) <= 16)) {
            this.method_151(var4, var2, var3);
         }
      }

   }

   // $FF: renamed from: a () int
   public final int method_107() {
      super.field_201.field_77 = 0;
      if(super.field_171 == 31) {
         super.field_171 = 10;
      }

      super.method_107();
      super.field_204 = false;
      if(super.field_178 < 0) {
         int var1 = -1;

         for(int var2 = 0; var2 < 3; ++var2) {
            if(super.field_176[var2]) {
               var1 = var2;
               break;
            }
         }

         if(var1 >= 0 && super.field_197 <= 0) {
            this.method_124(super.field_201.method_39(this.field_216), super.field_201.method_40(this.field_217), var1);
         }
      }

      if(super.field_161 >= 0 && !super.field_201.field_arr_class3_1[super.field_161].field_242) {
         this.method_150();
         super.field_201.method_86(56);
         return super.field_161;
      } else {
         return -1;
      }
   }

   // $FF: renamed from: a () boolean
   public final boolean method_105() {
      boolean var1;
      if(!(var1 = super.method_105())) {
         class_3 var2 = super.field_201.field_arr_class3_1[super.field_161];
         if(this.field_205 != null && !this.field_205.field_242 && var2.method_162(this.field_205)) {
            return true;
         }
      }

      return var1;
   }

   // $FF: renamed from: a (b) b
   public final class_3 method_148(class_3 var1) {
      int var2 = -1;
      int var3 = 10000;

      class_1 var4;
      for(int var5 = (var4 = this.method_122()).field_159; var5 < var4.field_159 + var4.field_160; ++var5) {
         class_3 var6;
         int var7;
         if(!(var6 = super.field_201.field_arr_class3_1[var5]).field_242 && (var7 = var1.method_175(var6.field_236, var6.field_237)) < var3) {
            var3 = var7;
            var2 = var5;
         }
      }

      if(var2 >= 0) {
         return super.field_201.field_arr_class3_1[var2];
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (b, b) boolean
   public final boolean method_149(class_3 var1, class_3 var2) {
      return !var1.field_242 && !var2.field_242?var1.method_164(var2.field_236, var2.field_237) || var2.method_164(var1.field_236, var1.field_237) || var1.method_175(var2.field_236, var2.field_237) < 16:false;
   }

   // $FF: renamed from: c () void
   public final void method_150() {
      for(int var1 = 0; var1 < super.field_160; ++var1) {
         class_3 var2;
         int var3;
         if(!(var2 = this.field_214[var1]).field_242 && var2.field_250 == 4 && (var3 = this.field_208[var1]) != 5 && var3 != 6 && var3 != 12 && var3 != 10) {
            int var4 = 0;
            int var5 = -1;

            for(int var6 = 0; var6 < super.field_160; ++var6) {
               class_3 var7;
               int var8 = (var7 = this.field_214[var6]).field_257 - var7.field_259;
               if(!var7.field_242 && var2 != var7 && var8 > var4) {
                  var4 = var8;
                  var5 = var6;
               }
            }

            if(var5 >= 0) {
               this.method_139(var1);
               this.field_208[var1] = 12;
               class_3 var9 = this.field_214[var5];
               this.field_211[var1][0] = var9.field_236;
               this.field_211[var1][1] = var9.field_237;
               this.field_212[var1] = var9.field_249;
               this.field_213[var1].removeAllElements();
            }
         }
      }

   }

   // $FF: renamed from: a (b, b, int) void
   public final void method_151(class_3 var1, class_3 var2, int var3) {
      if(this.field_208[var3] != 2) {
         this.method_139(var3);
      }

      this.field_208[var3] = 4;
      this.field_211[var3][0] = var2.field_236;
      this.field_211[var3][1] = var2.field_237;
      this.field_205 = var2;
      this.field_213[var3].removeAllElements();
   }

   // $FF: renamed from: a (b, int) boolean
   public final boolean method_152(class_3 var1, int var2) {
      class_1 var3;
      for(int var4 = (var3 = this.method_122()).field_159; var4 < var3.field_159 + var3.field_160; ++var4) {
         class_3 var5 = super.field_201.field_arr_class3_1[var4];
         if(this.method_149(var1, var5)) {
            if(var1.field_250 != 4) {
               this.method_151(var1, var5, var2);
            } else {
               this.method_139(var2);
               this.field_208[var2] = 11;
            }

            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: c (int) void
   public final void method_153(int var1) {
      this.field_214[var1].field_232 = false;
      super.field_161 = -1;
      super.field_201.method_57();
      if(this.field_208[var1] != 5) {
         this.field_210[var1] = 0;
      }

   }

   // $FF: renamed from: a (b, b) int
   public final int method_154(class_3 var1, class_3 var2) {
      byte var3 = 0;
      if(var1.field_250 < 4) {
         var3 = field_218[var1.field_250][var2.field_250];
      }

      return var1.method_160(var2) - var2.field_259 + var3;
   }

   // $FF: renamed from: b (b) b
   public final class_3 method_155(class_3 var1) {
      class_3[] var2 = new class_3[5];
      int var3 = 0;

      class_1 var4;
      int var5;
      for(var5 = (var4 = this.method_122()).field_159; var5 < var4.field_159 + var4.field_160; ++var5) {
         class_3 var6;
         if(!(var6 = super.field_201.field_arr_class3_1[var5]).field_242 && var1.method_162(var6) && var3 < 5) {
            var2[var3++] = var6;
         }
      }

      var5 = -1;
      int var9 = -10000;

      for(int var7 = 0; var7 < var3; ++var7) {
         int var8;
         if((var8 = this.method_154(var1, var2[var7])) > var9) {
            var9 = var8;
            var5 = var7;
         }
      }

      if(var5 < 0) {
         return null;
      } else {
         return var2[var5];
      }
   }

   // $FF: renamed from: a (b, int) void
   public final void method_156(class_3 var1, int var2) {
      if(this.field_210[var2] == 1) {
         this.method_153(var2);
      } else if(!this.method_152(var1, var2)) {
         this.method_153(var2);
      } else {
         this.field_210[var2] = 1;
         if(super.field_201.field_106 > 0) {
            this.method_147(var1, this.field_205);
         }

      }
   }

   // $FF: renamed from: d () void
   public final void method_104() {
      super.field_201.field_97 = 56;
      switch(super.field_171) {
      case 10:
         if(super.field_161 < 0) {
            super.field_161 = this.method_119(super.field_161);
            GameCanvas.getInstance().field_77 = 0;
            if(super.field_161 < 0) {
               super.field_201.method_20();
               return;
            }
         }

         class_3 var1;
         int var2 = (var1 = super.field_201.field_arr_class3_1[super.field_161]).field_236;
         int var3 = var1.field_237;
         if(super.field_204) {
            super.field_201.method_30(var1.field_234, var1.field_235);
         }

         if(super.field_204 || super.field_201.method_32(var2, var3) == 0) {
            int var4 = 2;

            for(int var5 = 0; var5 < super.field_160; ++var5) {
               if(this.field_214[var5] == var1) {
                  var4 = var5;
               }
            }

            super.field_201.method_63(super.field_161, true);
            class_1 var15 = this.method_122();
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            boolean var16;
            switch(this.field_208[var4]) {
            case 1:
               this.method_156(var1, var4);
               break;
            case 2:
               this.field_205 = this.method_148(var1);
               if(this.field_205 != null) {
                  if(this.field_210[var4] > 0) {
                     this.field_210[var4] = 0;
                     this.method_153(var4);
                  } else if(var1.field_250 == 4 && this.method_149(var1, this.field_205)) {
                     this.field_210[var4] = 1;
                     this.field_208[var4] = 11;
                     if(super.field_201.field_106 > 0) {
                        this.method_147(var1, this.field_205);
                     }
                  } else if(this.method_149(var1, this.field_205)) {
                     this.field_210[var4] = 1;
                     this.method_151(var1, this.field_205, var4);
                     if(super.field_201.field_106 > 0) {
                        this.method_147(var1, this.field_205);
                     }
                  } else {
                     int[][] var21 = new int[4][2];
                     var11 = 0;

                     for(var12 = 6; var12 >= 0; var12 -= 2) {
                        var13 = var2 + class_3.field_229[var12][0];
                        int var14 = var3 + class_3.field_229[var12][1];
                        if(super.field_201.method_58(var13, var14) != -1) {
                           var21[var11][0] = var13;
                           var21[var11][1] = var14;
                           ++var11;
                        }
                     }

                     if(var11 > 0) {
                        var12 = GameCanvas.method_2(var11);
                        this.field_209[var4] = 2;
                        this.field_211[var4][0] = var21[var12][0];
                        this.field_211[var4][1] = var21[var12][1];
                        this.field_210[var4] = 1;
                        this.field_208[var4] = 8;
                     } else {
                        this.method_153(var4);
                     }
                  }
               } else {
                  this.method_153(var4);
               }
               break;
            case 3:
            case 4:
            case 12:
               this.field_205 = this.method_148(var1);
               if(this.field_208[var4] == 4 && this.field_205 != null && var1.method_162(this.field_205)) {
                  this.method_139(var4);
                  this.field_212[var4] = this.field_205.field_249;
                  if(super.field_201.field_106 > 0) {
                     this.method_147(var1, this.field_205);
                  }

                  this.field_208[var4] = 9;
               } else if(this.field_213[var4].size() <= 0) {
                  var16 = false;
                  class_3 var17 = null;
                  if(this.field_208[var4] == 12 && !(var17 = super.field_201.field_arr_class3_1[super.field_201.method_60(this.field_212[var4])]).field_242) {
                     var17.field_242 = true;
                     var16 = true;
                  }

                  if(!this.method_145(var2, var3, this.field_211[var4][0], this.field_211[var4][1], var1, this.field_208[var4] == 12)) {
                     this.field_208[var4] = 11;
                  } else {
                     this.method_146(this.field_213[var4]);
                     if(this.field_213[var4].size() <= 1) {
                        if(this.field_208[var4] == 12) {
                           if(var1.field_248 >= var1.field_258) {
                              this.field_208[var4] = 10;
                           } else {
                              this.method_153(var4);
                           }
                        } else {
                           this.method_140(var4);
                        }

                        this.field_207.removeAllElements();
                     }
                  }

                  if(var16) {
                     var17.field_242 = false;
                  }
               } else {
                  var16 = false;
                  var7 = 6;
                  if((var8 = this.field_213[var4].size() - 1) + 1 < 6) {
                     var7 = var8 + 1;
                  }

                  int[] var18 = null;
                  Object var19 = null;
                  var11 = this.field_213[var4].size();

                  for(var12 = 0; var12 < var7; ++var12) {
                     int[] var20 = (int[])this.field_213[var4].elementAt(var11 - 1 - var12);
                     if(super.field_201.method_58(var20[0], var20[1]) != -1) {
                        var18 = var20;
                        var8 = var11 - 1 - var12;
                        var16 = true;
                     }
                  }

                  if(!var16) {
                     if(this.field_208[var4] == 12 && var1.field_248 >= var1.field_258) {
                        this.field_208[var4] = 10;
                     } else {
                        this.method_140(var4);
                     }
                  } else {
                     super.field_201.method_61(var18[0], var18[1]);
                     if(--super.field_201.field_89 >= 0) {
                        var1.method_179(var1.method_187(var2, var3, super.field_201.field_88[super.field_201.field_89][0], super.field_201.field_88[super.field_201.field_89][1]));
                        super.field_169 = var1;
                        super.field_171 = 11;
                        super.field_168 = 10;
                        super.field_201.field_77 = 0;
                        var12 = this.field_213[var4].size() - var8;

                        for(var13 = 0; var13 < var12; ++var13) {
                           this.field_213[var4].removeElementAt(this.field_213[var4].size() - 1);
                        }
                     } else if(this.field_208[var4] == 12 && var1.field_248 >= var1.field_258) {
                        this.field_208[var4] = 10;
                     } else {
                        this.method_153(var4);
                     }
                  }

                  if(this.field_208[var4] == 12) {
                     this.field_213[var4].removeAllElements();
                  }
               }
               break;
            case 5:
               if(--this.field_210[var4] <= 0) {
                  this.field_208[var4] = this.field_209[var4];
               } else {
                  this.method_156(var1, var4);
               }
               break;
            case 6:
               for(var6 = var15.field_159; var6 < var15.field_159 + var15.field_160; ++var6) {
                  if(super.field_201.field_arr_class3_1[var6].field_249 == this.field_212[var4]) {
                     this.field_208[var4] = this.field_209[var4];
                     break;
                  }
               }

               this.method_156(var1, var4);
            case 7:
            default:
               break;
            case 8:
               var6 = this.field_211[var4][0];
               var7 = this.field_211[var4][1];
               super.field_201.method_61(var6, var7);
               if(--super.field_201.field_89 >= 0) {
                  var1.method_179(var1.method_187(var2, var3, var6, var7));
                  super.field_169 = var1;
                  super.field_171 = 11;
                  super.field_168 = 10;
                  super.field_201.field_77 = 0;
               }
               break;
            case 9:
               this.field_205 = null;
               if(super.field_201.field_106 < 1) {
                  if((var6 = super.field_201.method_60(this.field_212[var4])) >= 0) {
                     this.field_205 = super.field_201.field_arr_class3_1[var6];
                  }
               } else {
                  this.field_205 = this.method_155(var1);
               }

               if(this.field_205 != null && (var1.field_250 == 0 || super.field_201.field_106 > 0) && var1.method_175(this.field_205.field_236, this.field_205.field_237) > 2) {
                  var16 = false;
                  var7 = var1.method_175(this.field_205.field_236, this.field_205.field_237);

                  for(var8 = class_3.field_229.length - 2; var8 >= 0; var8 -= 2) {
                     var9 = var2 + class_3.field_229[var8][0];
                     var10 = var3 + class_3.field_229[var8][1];
                     if((var11 = this.field_205.method_175(var9, var10)) < var7 && super.field_201.method_58(var9, var10) >= var1.field_258) {
                        var7 = var11;
                        this.field_211[var4][0] = var9;
                        this.field_211[var4][1] = var10;
                        var16 = true;
                     }
                  }

                  if(var16) {
                     this.field_209[var4] = 9;
                     this.field_208[var4] = 8;
                  }
               }

               if(this.field_208[var4] == 9) {
                  if(this.field_205 != null && var1.method_162(this.field_205) && !this.field_205.field_242) {
                     super.field_169 = var1;
                     this.field_213[var4].removeAllElements();
                     super.field_201.method_57();
                     super.field_170 = this.field_205;
                     super.field_162 = true;
                     var1.method_179(var1.method_187(var2, var3, super.field_170.field_236, super.field_170.field_237));
                     super.field_171 = 11;
                     super.field_168 = 12;
                     super.field_201.field_77 = 2;
                  } else {
                     this.method_140(var4);
                  }
               }
               break;
            case 10:
               super.field_170 = super.field_201.field_arr_class3_1[super.field_201.method_60(this.field_212[var4])];
               if(var1.method_172(super.field_170.field_236, super.field_170.field_237)) {
                  super.field_169 = var1;
                  this.method_113(21, super.field_170.field_236, super.field_170.field_237);
               } else {
                  this.method_140(var4);
               }
               break;
            case 11:
               var8 = 0;
               var9 = -1;
               this.field_205 = this.method_148(var1);
               if(this.field_205 != null) {
                  if(this.field_205.method_175(var2, var3) >= 36) {
                     this.method_140(var4);
                  } else {
                     for(var10 = 6; var10 >= 0; var10 -= 2) {
                        var11 = var2 + class_3.field_229[var10][0];
                        var12 = var3 + class_3.field_229[var10][1];
                        if((var13 = this.field_205.method_175(var11, var12)) > var8 && super.field_201.method_58(var11, var12) != -1) {
                           var8 = var13;
                           var9 = var10;
                        }
                     }

                     if(var9 < 0) {
                        this.method_140(var4);
                     } else {
                        this.field_209[var4] = 11;
                        this.field_211[var4][0] = var2 + class_3.field_229[var9][0];
                        this.field_211[var4][1] = var3 + class_3.field_229[var9][1];
                        this.field_208[var4] = 8;
                     }
                  }
               }
            }

            return;
         }
         break;
      case 23:
      case 26:
         super.field_171 = 10;
         super.field_162 = true;
         return;
      default:
         super.method_104();
      }

   }

   // $FF: renamed from: a (short) void
   public final void method_115(short var1) {
      if(!super.field_204 && (var1 & 64) != 0) {
         this.method_134();
         super.field_204 = true;
      }

   }

   // $FF: renamed from: b (short) void
   public final void method_117(short var1) {}

   // $FF: renamed from: a (boolean) void
   public final void method_120(boolean var1) {
      if(super.field_161 >= 0) {
         class_3 var2;
         (var2 = super.field_201.field_arr_class3_1[super.field_161]).field_232 = false;
         int var3 = 0;

         for(int var4 = 0; var4 < super.field_160; ++var4) {
            if(this.field_214[var4] == super.field_201.field_arr_class3_1[super.field_161]) {
               var3 = var4;
            }
         }

         boolean var5 = true;
         if(this.field_208[var3] == 8) {
            this.field_208[var3] = this.field_209[var3];
            var5 = false;
         }

         if(this.field_208[var3] == 12 && var2.field_248 >= var2.field_258) {
            this.field_208[var3] = 10;
            var5 = false;
         }

         if(!var1 && var5) {
            super.field_161 = -1;
         }
      }

      super.method_120(var1);
   }

   // $FF: renamed from: e () void
   public final void method_129() {
      super.field_188 = super.field_178;
      super.field_178 = -1;
      super.field_197 = 4;
      super.field_171 = 10;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, javax.microedition.lcdui.Image[]) void
   public final void method_118(Graphics var1, Image[] var2) {
      super.method_118(var1, var2);
      if(!super.field_204) {
         super.field_201.method_83(var1, 59);
      }

   }

   // $FF: renamed from: a (b) void
   public final void method_106(class_3 var1) {}

   // $FF: renamed from: f () void
   public final void method_157() {
      for(int var1 = 0; var1 < super.field_160; ++var1) {
         if(this.field_215[var1][0] != 0) {
            this.method_140(var1);
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_218 = new byte[][]{{(byte)30, (byte)0, (byte)80, (byte)100, (byte)90}, {(byte)100, (byte)50, (byte)0, (byte)80, (byte)75}, {(byte)0, (byte)100, (byte)50, (byte)70, (byte)80}, {(byte)40, (byte)0, (byte)100, (byte)60, (byte)80}};
   }
}
