package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: a
public final class class_5 {

    // $FF: renamed from: a java.lang.String
    private static String field_273;
    // $FF: renamed from: a javax.microedition.lcdui.Image
    private Image image;
    // $FF: renamed from: h int
    private int field_275;
    // $FF: renamed from: a short[][]
    private short[][] field_276;
    // $FF: renamed from: b short[][]
    private short[][] field_277;
    // $FF: renamed from: i int
    private int field_278;
    // $FF: renamed from: j int
    private int field_279;
    // $FF: renamed from: a int
    public int field_280;
    // $FF: renamed from: b int
    public int field_281;
    // $FF: renamed from: c int
    public int field_282;
    // $FF: renamed from: k int
    private int field_283;
    // $FF: renamed from: l int
    private int field_284;
    // $FF: renamed from: d int
    public int field_285;
    // $FF: renamed from: e int
    public int field_286;
    // $FF: renamed from: f int
    public int maxSomething;
    // $FF: renamed from: g int
    public int something;
    // $FF: renamed from: m int
    private int field_289;
    // $FF: renamed from: c short[][]
    private short[][] field_290;

   // $FF: renamed from: <init> (java.lang.String, javax.microedition.lcdui.Image, int) void
    // method_200
    public class_5(String var1, Image var2, int var3) throws Exception {
        // field_273 - ссылка на ресурс в .jar
        this.field_282 = 0;
        this.field_283 = 0;
        this.something = 0;
        field_273 = var1;
        this.image = var2;
        this.field_278 = var3;
        this.field_280 = this.image.getWidth() / this.field_278;
        InputStream is = getClass().getResourceAsStream(field_273);
        DataInputStream dis = new DataInputStream(is);
        this.field_279 = dis.readShort();
        this.field_275 = dis.readShort();
        this.field_276 = new short[this.field_275][];
        this.field_277 = new short[this.field_275][2];

        for (int i = 0; i < this.field_275; ++i) {
            this.field_277[i][0] = dis.readShort();
            this.field_277[i][1] = dis.readShort();
            this.field_276[i] = null;
        }

        if (this.field_279 % this.field_278 == 0) {
            this.field_281 = this.image.getHeight() / (this.field_279 / this.field_278);
        } else {
            this.field_281 = this.image.getHeight() / (this.field_279 / this.field_278 + 1);
        }

        is.close();
    }

    // $FF: renamed from: a (int, int) void
    public final void method_201(int var1, int var2) throws Exception {
        InputStream is = getClass().getResourceAsStream(field_273);
        DataInputStream dis = new DataInputStream(is);
        is.skip((long) this.field_277[var1][0]);
        int var5 = var1;

        for (int var6 = var1 + var2; var5 < var6; ++var5) {
            this.field_276[var5] = new short[this.field_277[var5][1]];
            int var7 = 0;

            for (short var8 = this.field_277[var5][1]; var7 < var8; ++var7) {
                this.field_276[var5][var7] = dis.readShort();
            }
        }

        is.close();
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
    public final void method_202(Graphics var1, int var2, int var3, int var4, int var5) {
        if (this.field_276[var2] != null) {
            int var6 = var3;
            int var7 = var4;
            short[] var8 = this.field_276[var2];
            if (var5 == 1) {
                var6 = var3 - (this.field_277[var2][1] * (this.field_280 + this.field_282) - this.field_282) / 2;
            } else if (var5 == 8) {
                var6 = var3 - (this.field_277[var2][1] * (this.field_280 + this.field_282) - this.field_282);
            }

            int var10 = 0;

            for (short var11 = this.field_277[var2][1]; var10 < var11; ++var10) {
                short var9;
                if ((var9 = var8[var10]) == 32763) {
                    var6 += this.field_280 + this.field_282;
                } else if (var9 == 32762) {
                    var6 = var3;
                    var7 += this.field_281 + this.field_283;
                } else {
                    var1.setClip(var6, var7, this.field_280, this.field_281);
                    var1.drawImage(this.image, var6 - var9 % this.field_278 * this.field_280, var7 - var9 / this.field_278 * this.field_281, 20);
                    var6 += this.field_280 + this.field_282;
                }
            }

        }
    }

    // $FF: renamed from: a (int, int, int) void
    public final void method_203(int var1, int var2, int var3) {
        this.field_284 = var1;
        int var4 = var3;
        this.field_285 = var2;
        short[] var5 = this.field_276[this.field_284];
        this.field_286 = 1;
        int var6 = 0;
        int var7 = 0;
        short var8 = this.field_277[this.field_284][1];
        boolean var10 = true;
        //boolean var11 = false;// no used
        //boolean var12 = false;
        int var13 = 0;
        StringBuffer strBufferOne = new StringBuffer(10);
        StringBuffer strBufferTwo = new StringBuffer(10);
        strBufferOne.append('\u0000');
        strBufferTwo.append('\u0000');

        int var16;
        while (var7 < var8) {
            if (var5[var7] == 32762) {
                strBufferOne.setCharAt(strBufferOne.length() - 1, (char) (var7 - var13));
                ++var7;
                ++this.field_286;
                var6 = 0;
                var10 = true;
                strBufferOne.append('\u0000');
                strBufferTwo.append((char) var7);
                var13 = var7;
            } else {
                int var18 = var7;
                short var9;
                if (var5[var7] == 32763) {
                    var18 = var7 + 1;
                } else {
                    while (var18 < var8 && (var9 = var5[var18]) != 32762 && var9 != 32763) {
                        ++var18;
                    }
                }

                int var19 = var18 - var7;
                if (var6 + var19 * (this.field_280 + this.field_282) - this.field_282 > this.field_285) {
                    if (var10) {
                        var16 = this.field_285 - var6 + this.field_282;
                        var7 += var16 / (this.field_280 + this.field_282);
                        ++this.field_286;
                        var6 = 0;
                        var10 = true;
                        strBufferOne.setCharAt(strBufferOne.length() - 1, (char) (var7 - var13));
                        strBufferOne.append('\u0000');
                        strBufferTwo.append((char) var7);
                        var13 = var7;
                    } else {
                        if (var5[var7] == 32763) {
                            ++var7;
                        }

                        ++this.field_286;
                        var6 = 0;
                        var10 = true;
                        strBufferOne.setCharAt(strBufferOne.length() - 1, (char) (var7 - var13));
                        strBufferOne.append('\u0000');
                        strBufferTwo.append((char) var7);
                        var13 = var7;
                    }
                } else {
                    var7 += var19;
                    var10 = false;
                    var6 += var19 * (this.field_280 + this.field_282);
                }
            }
        }

        strBufferOne.setCharAt(strBufferOne.length() - 1, (char) (var8 - var13));
        this.field_290 = (short[][]) null;
        this.field_290 = new short[strBufferOne.length()][2];
        var7 = 0;

        for (int var17 = strBufferOne.length(); var7 < var17; ++var7) {
            this.field_290[var7][0] = (short) strBufferTwo.charAt(var7);
            this.field_290[var7][1] = (short) strBufferOne.charAt(var7);
        }

        this.field_289 = 1;
        var16 = this.field_281;

        for (var7 = 1; var7 < this.field_286 && (var16 += this.field_283 + this.field_281) <= var4; ++var7) {
            ++this.field_289;
        }

        if (this.field_286 <= this.field_289) {
            this.maxSomething = 0;
        } else {
            this.maxSomething = this.field_286 - this.field_289 + 1;
        }
    }

    // $FF: renamed from: a (int) int
    public final int method_204(int var1) {
        return this.field_277[var1][1] * (this.field_280 + this.field_282) - this.field_282;
    }

    // $FF: renamed from: a () int
    public final int method_205() {
        return this.field_286 * (this.field_281 + this.field_283) - this.field_283;
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
    public final void method_206(Graphics var1, int var2, int var3, int var4) {
        int var5;
        if ((var5 = this.field_286 - this.something) > this.field_289) {
            var5 = this.field_289;
        }

        this.method_210(var1, var2, var3, this.something, var5, var4);
    }

    // $FF: renamed from: a (int) void
    public final void plusSomething(int paramIntPlus) {
        this.something += paramIntPlus;
        if (this.something > this.maxSomething) {
            this.something = this.maxSomething;
        }

    }

    // $FF: renamed from: b (int) void
    public final void minusSomething(int paramIntMinus) {
        this.something -= paramIntMinus;
        if (this.something < 0) {
            this.something = 0;
        }
    }

    // $FF: renamed from: c (int) void
    public final void setSomething(int paramInt) {
        this.something = paramInt;
        if (this.something > this.maxSomething) {
            this.something = this.maxSomething;
        } else {
            if (this.something < 0) {
                this.something = 0;
            }

        }
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
    public final void method_210(Graphics paramGraphics, int var2, int var3, int var4, int var5, int var6) {
        if (this.field_276[this.field_284] != null) {
            int var12 = var3;
            short[] var13 = this.field_276[this.field_284];
            int var7 = var4;

            for (int var8 = var4 + var5; var7 < var8; ++var7) {
                int var11;
                if (var6 == 4) {
                    var11 = var2;
                } else if (var6 == 1) {
                    var11 = var2 - (this.field_290[var7][1] * (this.field_280 + this.field_282) - this.field_282) / 2;
                } else {
                    var11 = var2 - (this.field_290[var7][1] * (this.field_280 + this.field_282) - this.field_282);
                }

                int var9;
                for (int var10 = (var9 = this.field_290[var7][0]) + this.field_290[var7][1]; var9 < var10; ++var9) {
                    paramGraphics.setClip(var11, var12, this.field_280, this.field_281);
                    paramGraphics.drawImage(this.image, var11 - var13[var9] % this.field_278 * this.field_280, var12 - var13[var9] / this.field_278 * this.field_281, 20);
                    var11 += this.field_280 + this.field_282;
                }

                var12 += this.field_281 + this.field_283;
            }

        }
    }

    // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
    public final void drawSomething_1(Graphics paramGraphics, int paramInt_1, int paramInt_2, int paramInt_3, int paramInt_4) {
        String localStr = "" + paramInt_1;
        if (paramInt_4 == 8) {
            paramInt_2 -= localStr.length() * (this.field_280 + this.field_282) - this.field_282;
        } else if (paramInt_4 == 1) {
            paramInt_2 -= (localStr.length() * (this.field_280 + this.field_282) - this.field_282) / 2;
        }

        int var7 = 0;
        int var8 = localStr.length();
        if (localStr.charAt(0) == 45) {
            ++var7;
            paramGraphics.setClip(paramInt_2, paramInt_3, this.field_280, this.field_281);
            paramGraphics.drawImage(this.image, paramInt_2 - 10 * this.field_280, paramInt_3, 20);
            paramInt_2 += this.field_280 + this.field_282;
        }

        while (var7 < var8) {
            paramGraphics.setClip(paramInt_2, paramInt_3, this.field_280, this.field_281);
            paramGraphics.drawImage(this.image, paramInt_2 - (localStr.charAt(var7) - 48) * this.field_280, paramInt_3, 20);
            paramInt_2 += this.field_280 + this.field_282;
            ++var7;
        }

    }
}
