package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import ua.naiksoftware.blitzkrieg.GameMIDlet;

// $FF: renamed from: f
public final class GameCanvas extends Canvas implements Runnable {

    // $FF: renamed from: a f
    public static GameCanvas gameCanvas;
    // $FF: renamed from: a java.util.Random
    public static Random random;
    // $FF: renamed from: a long
    public static long timeMillis;
    // $FF: renamed from: a int
    public int field_3;
    // $FF: renamed from: b int
    public int field_4;
    // $FF: renamed from: c int
    public int field_5;
    // $FF: renamed from: d int
    public int field_6;
    // $FF: renamed from: a boolean
    public boolean field_7;
    // $FF: renamed from: b boolean
    public boolean field_8;
    // $FF: renamed from: e int
    public int field_9;
    // $FF: renamed from: f int
    public int field_10;
    // $FF: renamed from: g int
    public int field_11;
    // $FF: renamed from: h int
    public int field_12;
    // $FF: renamed from: i int
    public int field_13;
    // $FF: renamed from: j int
    public int field_14;
    // $FF: renamed from: a java.lang.Thread
    public Thread thread;
    // $FF: renamed from: b long
    public long field_16;
    // $FF: renamed from: c long
    public long field_17;
    // $FF: renamed from: d long
    public long field_18;
    // $FF: renamed from: k int
    public int field_19;
    // $FF: renamed from: l int
    public int field_20;
    // $FF: renamed from: m int
    public int field_21;
    // $FF: renamed from: a long[][]
    private long[][] field_22;
    // $FF: renamed from: a short
    public short field_23;
    // $FF: renamed from: a javax.microedition.lcdui.Image[]
    public Image[] field_24;
    // $FF: renamed from: a java.io.InputStream
    private InputStream field_inputStream;
    // $FF: renamed from: n int
    public int field_26;
    // $FF: renamed from: a java.lang.String
    public String field_27;
    // $FF: renamed from: o int
    public int field_28;
    // $FF: renamed from: p int
    public int field_29;
    // $FF: renamed from: c boolean
    public boolean field_30;
    // $FF: renamed from: d boolean
    public boolean field_31;
    // $FF: renamed from: b short
    public short field_32;
    // $FF: renamed from: c short
    public short field_33;
    // $FF: renamed from: a e[]
    public class_1[] arr_class_1;
    // $FF: renamed from: a e
    public class_1 field_class_1;
    // $FF: renamed from: a d
    public class_2 field_class_2;
    // $FF: renamed from: q int
    public int field_37;
    // $FF: renamed from: r int
    public int field_38;
    // $FF: renamed from: a c
    public class_4 field_39;
    // $FF: renamed from: b c
    public class_4 field_40;
    // $FF: renamed from: c c
    public class_4 field_41;
    // $FF: renamed from: d c
    public class_4 field_42;
    // $FF: renamed from: e c
    public class_4 field_43;
    // $FF: renamed from: f c
    public class_4 field_44;
    // $FF: renamed from: g c
    public class_4 field_45;
    // $FF: renamed from: h c
    public class_4 field_46;
    // $FF: renamed from: s int
    public int field_47;
    // $FF: renamed from: t int
    public int field_48;
    // $FF: renamed from: u int
    public int field_49;
    // $FF: renamed from: v int
    public int field_50;
    // $FF: renamed from: w int
    public int field_51;
    // $FF: renamed from: a javax.microedition.lcdui.Image
    public Image image;
    // $FF: renamed from: x int
    public int mapRows;
    // $FF: renamed from: y int
    public int mapCols;
    // $FF: renamed from: z int
    public int field_55;
    // $FF: renamed from: A int
    public int field_56;
    // $FF: renamed from: a byte
    public byte field_57;
    // $FF: renamed from: b byte
    public byte field_58;
    // $FF: renamed from: B int
    public int field_59;
    // $FF: renamed from: C int
    public int field_60;
    // $FF: renamed from: D int
    public int field_61;
    // $FF: renamed from: E int
    public int field_62;
    // $FF: renamed from: d short
    public short field_63;
    // $FF: renamed from: e short
    public short field_64;
    // $FF: renamed from: F int
    public int field_65;
    // $FF: renamed from: G int
    public int field_66;
    // $FF: renamed from: H int
    public int field_67;
    // $FF: renamed from: I int
    public int field_68;
    // $FF: renamed from: J int
    public int field_69;
    // $FF: renamed from: K int
    public int field_70;
    // $FF: renamed from: a byte[][]
    public byte[][] mapMask;
    // $FF: renamed from: b byte[][]
    public byte[][] field_72;
    // $FF: renamed from: e boolean
    public boolean field_73;
    // $FF: renamed from: e long
    public long field_74;
    // $FF: renamed from: L int
    public int field_75;
    // $FF: renamed from: M int
    public int field_76;
    // $FF: renamed from: c byte
    public byte field_77;
    // $FF: renamed from: N int
    public int field_78;
    // $FF: renamed from: O int
    public int field_79;
    // $FF: renamed from: P int
    public int field_80;
    // $FF: renamed from: Q int
    public int field_81;
    // $FF: renamed from: R int
    public int field_82;
    // $FF: renamed from: S int
    public int field_83;
    // $FF: renamed from: f long
    public long field_84;
    // $FF: renamed from: a b[]
    public class_3[] field_arr_class3_1;
    // $FF: renamed from: T int
    public int field_86;
    // $FF: renamed from: U int
    public int field_87;
    // $FF: renamed from: a int[][]
    public int[][] field_88;
    // $FF: renamed from: V int
    public int field_89;
    // $FF: renamed from: a java.util.Vector
    public Vector field_vector;
    // $FF: renamed from: W int
    public int field_91;
    // $FF: renamed from: b int[][]
    public int[][] field_92;
    // $FF: renamed from: ao int
    private int field_93;
    // $FF: renamed from: a a
    public class_5 field_class5;
    // $FF: renamed from: ap int
    private int field_95;
    // $FF: renamed from: X int
    public int field_96;
    // $FF: renamed from: Y int
    public int field_97;
    // $FF: renamed from: Z int
    public int field_98;
    // $FF: renamed from: f boolean
    public boolean isLevelm;
    // $FF: renamed from: g boolean
    public boolean field_100;
    // $FF: renamed from: h boolean
    public boolean field_101;
    // $FF: renamed from: aa int
    public int field_102;
    // $FF: renamed from: ab int
    public int field_103;
    // $FF: renamed from: a int[]
    public int[] field_104;
    // $FF: renamed from: b int[]
    public int[] field_105;
    // $FF: renamed from: ac int
    public int field_106;
    // $FF: renamed from: i boolean
    public boolean stopThread;
    // $FF: renamed from: ad int
    public int field_108;
    // $FF: renamed from: a byte[]
    public byte[] field_109;
    // $FF: renamed from: j boolean
    public boolean field_110;
    // $FF: renamed from: ae int
    public int field_111;
    // $FF: renamed from: af int
    public int field_112;
    // $FF: renamed from: g long
    public long field_113;
    // $FF: renamed from: k boolean
    public boolean field_114;
    // $FF: renamed from: ag int
    public int field_115;
    // $FF: renamed from: l boolean
    public boolean field_116;
    // $FF: renamed from: d byte
    public byte field_117;
    // $FF: renamed from: e byte
    public byte field_118;
    // $FF: renamed from: f byte
    public byte field_119;
    // $FF: renamed from: b b[]
    public class_3[] field_arr_class3_2;
    // $FF: renamed from: g byte
    public byte field_121;
    // $FF: renamed from: h byte
    public byte field_122;
    // $FF: renamed from: i byte
    public byte field_123;
    // $FF: renamed from: j byte
    public byte field_124;
    // $FF: renamed from: k byte
    public byte field_125;
    // $FF: renamed from: l byte
    public byte field_126;
    // $FF: renamed from: m byte
    public byte field_127;
    // $FF: renamed from: c b[]
    public class_3[] field_arr_class3_3;
    // $FF: renamed from: n byte
    public byte field_129;
    // $FF: renamed from: o byte
    public byte field_130;
    // $FF: renamed from: p byte
    public byte field_131;
    // $FF: renamed from: q byte
    public byte field_132;
    // $FF: renamed from: b byte[]
    public byte[] field_133;
    // $FF: renamed from: a b
    public class_3 field_class_3;
    // $FF: renamed from: ah int
    public int field_135;
    // $FF: renamed from: ai int
    public int field_136;
    // $FF: renamed from: aj int
    public int field_137;
    // $FF: renamed from: ak int
    public static int field_138;
    // $FF: renamed from: al int
    public int field_139;
    // $FF: renamed from: am int
    public int field_140;
    // $FF: renamed from: an int
    public int field_141;
    // $FF: renamed from: a javax.microedition.media.Player[]
    public Player[] field_soundPlayers;
    // $FF: renamed from: m boolean
    public boolean field_143;

    // $FF: renamed from: <init> (boolean) void
    public GameCanvas(boolean var1) {
        this.field_8 = false;
        this.field_9 = -1;
        this.field_10 = 0;
        this.field_11 = 1;
        this.field_12 = 0;
        this.thread = null;
        this.field_29 = 1;
        this.field_30 = true;
        this.field_31 = true;
        this.field_47 = 0;
        this.field_63 = 0;
        this.field_64 = 0;
        this.field_65 = 8;
        this.field_66 = 8;
        this.field_73 = true;
        this.field_74 = 0L;
        this.field_77 = 1;
        this.field_82 = 0;
        this.field_83 = 0;
        this.field_84 = 0L;
        this.field_arr_class3_1 = null;
        this.field_88 = new int[7][];
        this.field_89 = -1;
        this.field_vector = new Vector(10);
        this.field_92 = new int[25][3];
        this.field_101 = true;
        this.field_104 = new int[]{2, 6, 10, 8};
        this.field_105 = new int[]{10, 5, 5};
        this.field_106 = 0;
        this.field_108 = 0;
        this.field_112 = 4;
        this.field_115 = 0;
        this.field_116 = false;
        this.field_arr_class3_2 = new class_3[20];
        this.field_arr_class3_3 = new class_3[20];
        this.field_133 = new byte[20];
        this.field_135 = -1;
        this.field_136 = -1;
        this.field_137 = 0;
        this.field_139 = 0;
        this.field_140 = 0;
        this.field_141 = 0;
        this.field_soundPlayers = new Player[12];
        gameCanvas = this;
        this.field_20 = this.field_21 = 0;
    }

    // $FF: renamed from: a () f
    public static final GameCanvas getInstance() {
        return gameCanvas;
    }

    // $FF: renamed from: a (int) int
    public static final int method_2(int var0) {
        return var0 > 0 ? Math.abs(random.nextInt() / (Integer.MAX_VALUE / var0)) : 0;
    }

    // $FF: renamed from: b (int) int
    public static final int method_3(int var0) {
        int var3 = var0;
        if (var0 <= 0) {
            return 0;
        } else {
            int var2;
            if ((var0 & -65536) > 0) {
                if ((var0 & -16777216) > 0) {
                    var2 = 16383;
                } else {
                    var2 = 1023;
                }
            } else if ((var0 & '\uff00') > 0) {
                var2 = 63;
            } else {
                var2 = var0 > 4 ? 7 : var0;
            }

            while (true) {
                int var1;
                var2 = ((var1 = var0 / var2 + var2) >> 1) + (var1 & 1);
                if (var3 <= var2) {
                    if (var0 / var3 == var3 - 1 && var0 % var3 == 0) {
                        --var3;
                    }

                    return var3;
                }

                var3 = var2;
            }
        }
    }

    // $FF: renamed from: a () void
    public final void initCanvas() {
        System.out.println("initCanvas begin");
        try {
            this.method_14(19);
            this.thread = new Thread(this);
            this.thread.start();
            this.stopThread = false;
            this.setFullScreenMode(true);
            GameMIDlet.setDisplayable(this);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    // $FF: renamed from: b () void
    public final void resumeCanvas() {
        this.field_20 = this.field_21;
    }

    // $FF: renamed from: c () void
    public final void pauseCanvas() {
        this.field_21 = this.field_20;
        System.currentTimeMillis();//?
        this.field_20 = 15;
    }

    /* GAME CYCLE */
    public final void run() {
        Thread localThread = Thread.currentThread();
        this.stopThread = false;

        while (localThread == this.thread && !this.stopThread) {
            //System.out.println("game cycle begin iteration");
            timeMillis = System.currentTimeMillis();
            if (timeMillis >= this.field_18) {
                this.field_18 = timeMillis + 1000L;
                this.field_19 = 0;
            }

            if (timeMillis >= this.field_16) {
                this.field_16 = timeMillis + 62L;
                ++this.field_19;
                this.field_143 = false;
                if (this.field_20 == 38) {
                    this.stopThread = true;
                    GameMIDlet.getInstance().destroyApp(true);

                    try {
                        this.closeStreamAndRes();
                    } catch (Exception e) {
                        System.err.println(e);
                        e.printStackTrace();
                    }

                    this.thread = null;
                    return;
                }

                this.method_12();
                this.method_13();
                this.repaint();
                this.serviceRepaints();
            }

            try {
                Thread.sleep(10L);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    // $FF: renamed from: d () void
    public final void closeStreamAndRes() throws Exception {
        this.field_inputStream.close();
        this.field_inputStream = null;
        this.field_22 = (long[][]) null;
        this.field_23 = 0;
        this.field_26 = 0;
    }

    // $FF: renamed from: a (java.lang.String) void
    public final void reinitStreamAndRes(String paramStr) throws Exception {
        if (this.field_inputStream != null) {
            this.closeStreamAndRes();
        }

        this.field_27 = paramStr;
        this.field_inputStream = getClass().getResourceAsStream(paramStr);
        DataInputStream var2 = new DataInputStream(this.field_inputStream);
        this.field_23 = var2.readShort();
        this.field_28 = 0;
        this.field_22 = new long[this.field_23][2];

        for (int var3 = 0; var3 < this.field_23; ++var3) {
            this.field_22[var3][0] = var2.readLong();
            this.field_22[var3][1] = var2.readLong();
            this.field_28 = (int) ((long) this.field_28 + this.field_22[var3][1]);
        }

    }

    // $FF: renamed from: a (int, int) int
    public final int method_9(int paramInt_1, int paramInt_2) throws Exception {
        if (this.field_26 != paramInt_1) {
            if (this.field_26 > paramInt_1) {
                if (this.field_inputStream != null) {
                    this.field_inputStream.close();
                }

                this.field_inputStream = getClass().getResourceAsStream(this.field_27);
                this.field_inputStream.skip(this.field_22[paramInt_1][0]);
            } else {
                this.field_inputStream.skip(this.field_22[paramInt_1][0] - this.field_22[this.field_26][0]);
            }
        }

        if (this.field_109 == null) {
            this.field_109 = new byte[(int) this.field_22[paramInt_1][1]];
        }

        if (paramInt_1 + paramInt_2 > this.field_23) {
            paramInt_2 = this.field_23 - paramInt_1;
        }

        this.field_26 = paramInt_1 + paramInt_2;

        for (int var3 = paramInt_1; var3 < this.field_26; ++var3) {
            int var4 = (int) this.field_22[var3][1];
            if (this.field_109.length < var4) {
                this.field_109 = new byte[var4];
            }

            boolean var5 = false;
            int var6 = 0;

            int var7;
            do {
                var7 = this.field_inputStream.read(this.field_109, var6, var4 - var6);
                var6 += var7;
            } while (var7 != -1 && var6 < var4);

            this.field_24[var3] = Image.createImage(this.field_109, 0, var4);
        }

        return this.field_26;
    }

    // $FF: renamed from: e () void
    public final void readRecordStore() {
        try {
            RecordStore store;
            RecordEnumeration rEnum = (store = RecordStore.openRecordStore("options", true)).enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            ByteArrayInputStream bais = new ByteArrayInputStream(rEnum.nextRecord());
            DataInputStream dis = new DataInputStream(bais);
            this.field_30 = dis.readBoolean();
            this.field_31 = dis.readBoolean();
            this.field_9 = dis.readInt();
            this.field_10 = dis.readInt();
            store.closeRecordStore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // $FF: renamed from: f () void
    public final void writeRecordStore() {
        try {
            RecordStore store;
            RecordEnumeration rEnum = (store = RecordStore.openRecordStore("options", false)).enumerateRecords((RecordFilter) null, (RecordComparator) null, false);

            while (rEnum.hasNextElement()) {
                store.deleteRecord(rEnum.nextRecordId());
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos;
            (dos = new DataOutputStream(baos)).writeBoolean(this.field_30);
            dos.writeBoolean(this.field_31);
            dos.writeInt(this.field_9);
            dos.writeInt(this.field_10);
            store.addRecord(baos.toByteArray(), 0, baos.toByteArray().length);
            store.closeRecordStore();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    public final void keyPressed(int keyCode) {
        if (52 == keyCode || keyCode == -3) {
            this.field_32 = (short) (this.field_32 | 1);
        }

        if (54 == keyCode || keyCode == -4) {
            this.field_32 = (short) (this.field_32 | 2);
        }

        if (50 == keyCode || keyCode == -1) {
            this.field_32 = (short) (this.field_32 | 4);
        }

        if (56 == keyCode || keyCode == -2) {
            this.field_32 = (short) (this.field_32 | 8);
        }

        if (53 == keyCode || keyCode == -5) {
            this.field_32 = (short) (this.field_32 | 16);
        }

        if (49 == keyCode) {
            this.field_32 = (short) (this.field_32 | 5);
        }

        if (51 == keyCode) {
            this.field_32 = (short) (this.field_32 | 6);
        }

        if (55 == keyCode) {
            this.field_32 = (short) (this.field_32 | 9);
        }

        if (57 == keyCode) {
            this.field_32 = (short) (this.field_32 | 10);
        }

        if (-6 == keyCode) {
            this.field_32 = (short) (this.field_32 | 32);
        }

        if (-7 == keyCode) {
            this.field_32 = (short) (this.field_32 | 64);
        }

        if (35 == keyCode) {
            this.field_32 = (short) (this.field_32 | 128);
        }

        if (42 == keyCode) {
            this.field_32 = (short) (this.field_32 | 256);
        }

        if (48 == keyCode) {
            this.field_32 = (short) (this.field_32 | 512);
        }

    }

    public final void keyReleased(int keyCode) {
        if (52 == keyCode || keyCode == -3) {
            this.field_32 = (short) (this.field_32 & -2);
        }

        if (54 == keyCode || keyCode == -4) {
            this.field_32 = (short) (this.field_32 & -3);
        }

        if (50 == keyCode || keyCode == -1) {
            this.field_32 = (short) (this.field_32 & -5);
        }

        if (56 == keyCode || keyCode == -2) {
            this.field_32 = (short) (this.field_32 & -9);
        }

        if (53 == keyCode || keyCode == -5) {
            this.field_32 = (short) (this.field_32 & -17);
        }

        if (49 == keyCode) {
            this.field_32 = (short) (this.field_32 & -6);
        }

        if (51 == keyCode) {
            this.field_32 = (short) (this.field_32 & -7);
        }

        if (55 == keyCode) {
            this.field_32 = (short) (this.field_32 & -10);
        }

        if (57 == keyCode) {
            this.field_32 = (short) (this.field_32 & -11);
        }

        if (-6 == keyCode) {
            this.field_32 = (short) (this.field_32 & -33);
        }

        if (-7 == keyCode) {
            this.field_32 = (short) (this.field_32 & -65);
        }

        if (35 == keyCode) {
            this.field_32 &= -129;
        }

        if (42 == keyCode) {
            this.field_32 &= -257;
        }

        if (48 == keyCode) {
            this.field_32 &= -513;
        }

    }

    public final void paint(Graphics g) {
        switch (this.field_20) {
            case 1:
            case 30:
                g.drawImage(this.field_24[3], 0, 0, 0);
                this.method_15(g, this.field_39, 240 - this.field_39.field_270 + this.field_48, 120);
                return;
            case 2:
            case 3:
            case 19:
                g.setColor(16777215);
                g.fillRect(0, 0, 240, 320);
                g.drawImage(this.field_24[0], 120, 160, 3);
                if (this.field_20 != 2) {
                    return;
                }

                g.setColor(0);
                g.drawString("" + this.field_29 * 100 / this.field_14 + "%", 107, 266, 0);
                g.drawRect(58, 240, 123, 7);
                g.setColor(187);
                g.fillRect(60, 242, 120 * this.field_29 / this.field_14, 4);
                return;
            case 4:
                g.setColor(0);
                g.fillRect(0, 0, 240, 320);
                this.method_75(g, 78, 120, 160);
                return;
            case 5:
                this.method_24(g);
                this.arr_class_1[this.field_37].method_118(g, this.field_24);
                return;
            case 6:
            case 7:
                g.drawImage(this.field_24[3], 0, 0, 0);
                g.drawImage(this.field_24[2], 0, 0, 0);
                this.method_74(g, 3, 40, 234, 240, 1);
                this.method_83(g, this.field_97);
                return;
            case 11:
                if (this.field_110) {
                    g.drawImage(this.field_24[3], 0, 0, 0);
                    this.method_93(g, 0, 0, 240, 270);
                    this.field_110 = false;
                }

                int var2 = this.field_29 * 32 / this.field_14 - 16;
                g.setClip(0, 0, 240, 320);
                g.drawImage(this.field_24[14], 120, 320, 33);
                g.setColor(0);
                g.drawLine(120 + var2 / 2, 320 - (method_3(360 - var2 * var2) >> 1) - 21, 120 + var2, 320 - method_3(360 - var2 * var2) - 21);
                return;
            case 20:
                this.method_24(g);
                this.method_15(g, this.field_41, 10, 10);
                this.method_83(g, 57);
                return;
            case 21:
                g.drawImage(this.field_24[3], 0, 0, 0);
                g.drawImage(this.field_24[2], 0, 0, 0);
                this.method_15(g, this.field_44, 240 - this.field_44.field_270, 120);
                return;
            case 22:
                this.method_24(g);
                this.method_84(g, this.field_96);
                this.method_15(g, this.field_40, 10, 10);
                return;
            case 23:
                this.method_24(g);
                g.setColor(10526880);
                this.method_15(g, this.field_40, 10, 10);
                this.method_15(g, this.field_42, 40, 40);
                return;
            case 24:
                g.drawImage(this.field_24[3], 0, 0, 0);
                this.method_15(g, this.field_43, 245 - this.field_43.field_270, 120);
                return;
            case 25:
                g.drawImage(this.field_24[3], 0, 0, 0);
                this.method_76(g, 120, 160);
                g.setClip(0, 0, 240, 320);
                this.method_84(g, this.field_96);
                this.method_83(g, this.field_97);
                return;
            case 26:
                this.method_24(g);
                this.method_75(g, 77, 120, 160);
                return;
            case 28:
                this.method_79(g, 20, 8 + this.field_3, 9 + this.field_4);
                g.setColor(16777215);
                g.drawRect(8 + this.field_3 + this.field_59 * 20 / this.field_57, 9 + this.field_4 + this.field_60 * 20 / this.field_58, 4800 / this.field_57 - 1, 6400 / this.field_58 - 1);
                this.method_84(g, this.field_96);
                return;
            case 29:
                this.method_24(g);
                this.method_71(g);
                this.method_84(g, this.field_96);
                this.method_83(g, this.field_97);
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 27:
            case 38:
            default:
                return;
            case 31:
                this.method_24(g);
                this.method_75(g, 101, 120, 160);
                g.setClip(0, 0, 240, 320);
                this.method_83(g, this.field_97);
                this.method_84(g, this.field_96);
                return;
            case 32:
                this.method_79(g, 20, 8 + this.field_3, 9 + this.field_4);
                g.setColor(16777215);
                g.drawRect(8 + this.field_3 + this.field_75 * 20 / this.field_57, 9 + this.field_4 + this.field_76 * 20 / this.field_58, 19, 19);
                this.method_84(g, this.field_96);
                this.method_83(g, this.field_98);
                return;
            case 33:
                this.method_93(g, 0, 0, 240, 320);
                this.method_84(g, 57);
                return;
            case 34:
                class_3 var8 = this.field_arr_class3_1[this.field_135];
                this.method_73(g, 0, 0, 240, 320);
                this.field_class5.method_206(g, 120, 15, 1);
                int var6 = 15 + this.field_class5.method_205() + 11;
                g.setClip(0, 0, 240, 320);
                g.fillRect(15, var6 - 7, 210, 1);
                this.field_class5.method_202(g, 76, 15, var6, 4);
                this.field_class5.drawSomething_1(g, var8.field_259, 225 - 3 * (this.field_class5.field_280 + this.field_class5.field_282) - 5, var6, 8);
                g.setClip(0, 0, 240, 320);
                g.drawLine(225 - 3 * (this.field_class5.field_280 + this.field_class5.field_282) - 5, var6 - 2 + this.field_class5.field_281, 225 - 3 * (this.field_class5.field_280 + this.field_class5.field_282), var6);
                this.field_class5.drawSomething_1(g, var8.field_257, 225, var6, 8);
                var6 += 15;
                g.setClip(0, 0, 240, 320);
                g.setColor(0, 0, 0);
                g.drawRect(15, var6, 210, 7);
                g.setColor(0, 255, 0);
                g.fillRect(17, var6 + 2, 207 * var8.field_259 / var8.field_257, 4);
                var6 += 17;
                g.setColor(0);
                g.setClip(0, 0, 240, 320);
                g.fillRect(15, var6 - 3, 210, 1);
                var6 += 4;

                for (int var7 = 0; var7 < 8; ++var7) {
                    this.field_class5.method_202(g, 68 + var7, 200, var6 + var7 * 15, 8);
                }

                this.field_class5.drawSomething_1(g, var8.field_251, 198, var6 + 0, 4);
                this.field_class5.drawSomething_1(g, var8.field_252, 198, var6 + 15, 4);
                this.field_class5.drawSomething_1(g, var8.field_253, 198, var6 + 30, 4);
                this.field_class5.drawSomething_1(g, var8.field_254, 198, var6 + 45, 4);
                this.field_class5.drawSomething_1(g, var8.field_255[0], 198, var6 + 60, 4);
                this.field_class5.drawSomething_1(g, var8.field_255[1], 198, var6 + 75, 4);
                this.field_class5.drawSomething_1(g, var8.field_255[2], 198, var6 + 90, 4);
                this.field_class5.drawSomething_1(g, var8.field_256, 198, var6 + 105, 4);
                this.method_84(g, this.field_96);
                return;
            case 35:
                g.setColor(0);
                g.fillRect(0, 0, 240, 320);
                this.method_76(g, 120, 160);
                return;
            case 36:
                g.drawImage(this.field_24[3], 0, 0, 0);
                this.method_15(g, this.field_45, 240 - this.field_45.field_270, 120);
                return;
            case 37:
                this.method_73(g, 0, 0, 240, 320);
                this.field_class5.method_202(g, 9, 120, 40, 1);

                for (int var5 = 0; var5 < 4; ++var5) {
                    this.field_class5.method_202(g, 10 + var5, 10, 65 + var5 * 25, 4);
                    int var3 = this.field_class5.method_204(10 + var5);
                    this.field_class5.drawSomething_1(g, this.arr_class_1[this.field_37].field_158[var5], 10 + var3, 65 + var5 * 25, 4);
                    this.field_class5.method_202(g, 14, 10 + var3 + this.field_class5.field_280 + this.field_class5.field_282, 65 + var5 * 25, 4);
                    if (this.arr_class_1[this.field_37].field_158[var5] < 5) {
                        int var4 = this.arr_class_1[this.field_37].field_157[var5] * 1000 / class_1.field_156[var5][this.arr_class_1[this.field_37].field_158[var5]];
                        g.setClip(0, 0, 240, 320);
                        g.setColor(0, 0, 0);
                        g.fillRect(10, 80 + var5 * 25, 220, 7);
                        g.setColor(233, 210, 169);
                        g.fillRect(11, 81 + var5 * 25, 218, 5);
                        g.setColor(0, 255, 0);
                        g.fillRect(11, 81 + var5 * 25, 218 * var4 / 1000, 5);
                    }
                }

                this.method_84(g, this.field_96);
                return;
            case 39:
            case 42:
            case 46:
                this.method_24(g);
                this.method_76(g, 120, 160);
                g.setClip(0, 0, 240, 320);
                this.method_83(g, this.field_97);
                this.method_84(g, this.field_96);
                return;
            case 40:
            case 41:
                this.method_24(g);
                this.method_71(g);
                this.method_83(g, this.field_97);
                return;
            case 43:
                this.method_24(g);
                this.method_76(g, 120, 160);
                this.method_83(g, this.field_97);
                return;
            case 44:
                g.setColor(16776960);
                g.fillRect(0, 0, 240, 320);
                g.drawImage(this.field_24[260], 0, 0, 0);
                this.field_class5.method_202(g, 94, 120, 265, 1);
                this.field_class5.method_202(g, 95 + this.field_106, 120, 290, 1);
                return;
            case 45:
                g.drawImage(this.field_24[3], 0, 0, 0);
                this.method_15(g, this.field_46, 245 - this.field_46.field_270, 120);
        }
    }

    // $FF: renamed from: g () void
    public final void method_12() {
        this.field_139 >>= 1;
        this.field_140 >>= 1;
        switch (this.field_20) {
            case 1:
                this.field_48 >>= 2;
                break;
            case 2:
                this.field_108 = this.method_92(this.field_108);
                return;
            case 3:
                if (this.field_17 < timeMillis) {
                    this.method_14(1);
                    return;
                }
                break;
            case 4:
                if (this.isLevelm) {
                    this.method_14(35);
                } else if (this.field_8) {
                    this.method_14(5);
                } else {
                    this.method_14(29);
                }

                this.field_8 = false;
                return;
            case 5:
                if (timeMillis > this.field_113) {
                    if (++this.field_111 > 3) {
                        this.field_111 = 0;
                    }

                    if (++this.field_112 > 6) {
                        this.field_112 = 4;
                    }

                    this.field_113 = timeMillis + 150L;
                }

                if (this.arr_class_1[this.field_37].field_162) {
                    this.method_29(14);
                } else {
                    this.method_29(8);
                }

                this.arr_class_1[this.field_37].method_104();
                if (this.field_20 == 5) {
                    this.arr_class_1[this.field_37].method_104();
                    return;
                }
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 29:
            case 31:
            default:
                break;
            case 11:
                for (; timeMillis < this.field_16; timeMillis = System.currentTimeMillis()) {
                    if (this.field_26 >= this.field_23 - 1) {
                        this.method_14(33);
                        return;
                    }

                    this.field_29 = (int) ((long) this.field_29 + this.field_22[this.field_26][1]);
                    boolean var1 = false;

                    try {
                        this.method_9(this.field_26, 1);
                    } catch (Exception var3) {
                        ;
                    }
                }

                return;
            case 19:
                this.method_14(2);
                return;
            case 26:
                this.method_14(5);
                return;
            case 28:
            case 32:
                if (this.arr_class_1[this.field_37].field_162) {
                    this.method_29(14);
                    return;
                }

                this.method_29(8);
                return;
            case 30:
                this.field_48 <<= 2;
                if (this.field_48 > 480) {
                    this.method_14(this.field_21);
                    return;
                }
        }

    }

    // $FF: renamed from: h () void
    public final void method_13() {
        if (this.field_33 == this.field_32) {
            switch (this.field_20) {
                case 6:
                case 7:
                case 29:
                case 40:
                case 41:
                    if (timeMillis >= this.field_74) {
                        this.field_74 = timeMillis + 150L;
                        if ((this.field_32 & 8) != 0) {
                            this.field_class5.plusSomething(1);
                            return;
                        }

                        if ((this.field_32 & 4) != 0) {
                            this.field_class5.minusSomething(1);
                        }
                    }
                    break;
                case 11:
                case 33:
                    if (timeMillis >= this.field_74) {
                        this.field_74 = timeMillis + 150L;
                        if ((this.field_32 & 8) != 0) {
                            this.field_class5.plusSomething(2);
                            this.field_110 = true;
                            return;
                        }

                        if ((this.field_32 & 4) != 0) {
                            this.field_class5.minusSomething(2);
                            this.field_110 = true;
                            return;
                        }
                    }
                    break;
                case 28:
                    if ((this.field_32 & 1) != 0) {
                        this.field_59 -= 10;
                    } else if ((this.field_32 & 2) != 0) {
                        this.field_59 += 10;
                    }

                    if ((this.field_32 & 4) != 0) {
                        this.field_60 -= 10;
                    } else if ((this.field_32 & 8) != 0) {
                        this.field_60 += 10;
                    }

                    this.field_59 = this.method_35(this.field_59);
                    this.field_60 = this.method_36(this.field_60);
                    this.field_75 = this.method_39(this.method_41(this.field_59 + (this.field_67 + this.field_68 >> 1)));
                    this.field_76 = this.method_40(this.method_42(this.field_60 + (this.field_69 + this.field_70 >> 1)));
                case 32:
                    this.method_80();
                    return;
            }

        } else {
            short var1;
            if ((var1 = (short) ((this.field_33 ^ this.field_32) & this.field_32)) != 0) {
                label339:
                switch (this.field_20) {
                    case 2:
                    case 4:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 26:
                    case 27:
                    case 30:
                    case 38:
                    default:
                        break;
                    case 3:
                        this.method_14(1);
                        break;
                    case 5:
                        this.arr_class_1[this.field_37].method_115(this.field_32);
                        if ((var1 & 32) != 0 && this.field_37 == this.field_38 && this.arr_class_1[this.field_37].field_171 == 10) {
                            this.method_14(22);
                        } else if ((var1 & 64) != 0 && this.field_37 == this.field_38 && this.arr_class_1[this.field_37].field_171 == 10) {
                            switch (this.field_97) {
                                case 57:
                                    this.arr_class_1[this.field_37].method_109();
                                    break label339;
                                case 58:
                                    this.field_136 = this.method_78(this.field_136 - 1);
                                    this.field_77 = 2;
                                    this.arr_class_1[this.field_37].field_162 = true;
                                    this.arr_class_1[this.field_37].field_171 = 25;
                                    break label339;
                                case 64:
                                    this.method_20();
                            }
                        } else if ((var1 & 256) != 0 && this.field_38 == this.field_37) {
                            this.method_14(28);
                        } else if ((var1 & 512) != 0 && this.field_38 == this.field_37 && this.field_135 >= 0) {
                            this.method_14(34);
                        }
                        break;
                    case 6:
                    case 7:
                        if ((var1 & 16) == 0 && (var1 & 64) == 0) {
                            if ((var1 & 8) != 0) {
                                this.field_class5.plusSomething(1);
                            } else if ((var1 & 4) != 0) {
                                this.field_class5.minusSomething(1);
                            }

                            this.field_74 = 0L;
                        } else {
                            this.method_14(1);
                        }
                        break;
                    case 20:
                        if ((var1 & 64) != 0) {
                            this.method_14(5);
                            this.arr_class_1[this.field_37].method_109();
                            break;
                        }
                    case 1:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 36:
                    case 45:
                        this.method_21(var1);
                        break;
                    case 25:
                        if ((var1 & 64) != 0) {
                            this.method_14(1);
                        } else if ((var1 & 32) != 0) {
                            this.method_14(36);
                        }
                        break;
                    case 28:
                    case 37:
                        if ((var1 & 16) != 0 || (var1 & 256) != 0 || (var1 & 32) != 0) {
                            this.method_14(5);
                        }
                        break;
                    case 31:
                        if ((var1 & 64) != 0) {
                            this.method_14(5);
                        } else if ((var1 & 32) != 0) {
                            this.method_14(38);
                        }
                        break;
                    case 32:
                        this.method_28(this.field_32);
                        if ((var1 & 64) != 0) {
                            this.method_14(22);
                        } else if ((var1 & 32) != 0) {
                            if (this.arr_class_1[this.field_37].field_178 < 0) {
                                this.arr_class_1[this.field_37].method_124(this.field_75, this.field_76, this.field_47);
                            }

                            this.method_14(5);
                        }
                        break;
                    case 33:
                        if ((var1 & 16) != 0 || (var1 & 32) != 0 || (var1 & 64) != 0) {
                            this.method_14(4);
                            break;
                        }
                    case 11:
                        if ((var1 & 8) != 0) {
                            this.field_class5.plusSomething(2);
                            this.field_110 = true;
                        } else if ((var1 & 4) != 0) {
                            this.field_class5.minusSomething(2);
                            this.field_110 = true;
                        }

                        this.field_74 = 0L;
                        break;
                    case 34:
                        if ((var1 & 512) != 0 && this.field_38 == this.field_37) {
                            this.method_14(5);
                        } else if ((var1 & 32) != 0) {
                            this.field_103 = 0;
                            this.method_14(5);
                        } else if (!this.isLevelm && this.field_103 < this.field_104.length && var1 == this.field_104[this.field_103]) {
                            ++this.field_103;
                            if (this.field_103 == this.field_104.length) {
                                this.method_14(40);
                            }
                        } else if (!this.isLevelm && this.field_103 < this.field_105.length && var1 == this.field_105[this.field_103]) {
                            ++this.field_103;
                            if (this.field_105.length == this.field_103) {
                                int var3;
                                for (int var2 = 0; var2 < this.mapCols; ++var2) {
                                    for (var3 = 0; var3 < this.mapRows; ++var3) {
                                        this.arr_class_1[this.field_37].field_172[var2][var3] = false;
                                    }
                                }

                                class_1 var4 = this.arr_class_1[this.field_37].method_122();

                                for (var3 = 0; var3 < 15; ++var3) {
                                    var4.field_151[var3] = true;
                                }

                                this.method_14(5);
                            }
                        } else {
                            this.field_103 = 0;
                        }
                        break;
                    case 35:
                        if ((var1 & 16) != 0) {
                            this.method_14(5);
                        }
                        break;
                    case 39:
                        if ((var1 & 32) != 0) {
                            this.method_14(33);
                        } else if ((var1 & 64) != 0) {
                            this.field_7 = true;
                            this.method_14(1);
                        }
                        break;
                    case 40:
                        if ((var1 & 8) != 0) {
                            this.field_class5.plusSomething(1);
                        } else if ((var1 & 4) != 0) {
                            this.field_class5.minusSomething(1);
                        }

                        this.field_74 = 0L;
                        if ((var1 & 16) == 0 && (var1 & 64) == 0) {
                            if ((var1 & 32) != 0) {
                                if (this.field_100) {
                                    this.field_7 = true;
                                    this.method_14(1);
                                } else {
                                    this.method_85();
                                }
                            }
                        } else {
                            ++this.field_93;
                            if (this.field_93 < this.field_91) {
                                this.field_class5.method_203(this.field_92[this.field_93][2] + 128, 220, 50);
                                this.field_class5.setSomething(0);
                            } else if (this.field_100) {
                                this.field_7 = true;
                                this.method_14(1);
                            } else {
                                this.field_114 = true;
                                this.method_85();
                            }
                        }
                        break;
                    case 41:
                        if ((var1 & 64) != 0) {
                            this.field_7 = true;
                            this.field_101 = true;
                            this.method_14(39);
                            break;
                        } else if ((var1 & 8) == 0 && (var1 & 4) == 0) {
                            break;
                        }
                    case 29:
                        if ((var1 & 8) != 0) {
                            this.field_class5.plusSomething(1);
                        } else if ((var1 & 4) != 0) {
                            this.field_class5.minusSomething(1);
                        }

                        this.field_74 = 0L;
                        if ((var1 & 16) == 0 && (var1 & 64) == 0) {
                            if ((var1 & 32) != 0) {
                                if (this.field_95 >= 0) {
                                    this.field_93 = this.field_95;
                                    this.field_95 = -1;
                                } else {
                                    while (this.field_92[this.field_93][0] == 0 || this.field_49 >> 1 == this.field_92[this.field_93][0]) {
                                        ++this.field_93;
                                    }
                                }

                                this.method_14(5);
                            }
                        } else {
                            ++this.field_93;
                            if (this.field_92[this.field_93][0] != 0 && (this.field_95 >= 0 || this.field_49 >> 1 != this.field_92[this.field_93][0])) {
                                if (this.field_95 >= 0) {
                                    this.field_93 = this.field_95;
                                    this.field_95 = -1;
                                }

                                this.method_14(5);
                            } else {
                                this.field_class5.method_203(this.field_92[this.field_93][2] + 128, 220, 50);
                                this.field_class5.setSomething(0);
                            }
                        }
                        break;
                    case 42:
                        if ((var1 & 32) != 0) {
                            if (this.isLevelm) {
                                this.method_14(43);
                            } else {
                                this.method_14(41);
                            }
                        } else if ((var1 & 64) != 0) {
                            this.method_14(5);
                        }
                        break;
                    case 43:
                        if ((var1 & 64) != 0) {
                            this.method_14(1);
                        }
                        break;
                    case 44:
                        if ((var1 & 16) != 0) {
                            this.method_14(1);
                        }
                        break;
                    case 46:
                        if ((var1 & 32) != 0) {
                            this.field_8 = true;
                            if (!this.isLevelm) {
                                this.field_11 = this.field_9;
                            }

                            this.method_14(33);
                        } else if ((var1 & 64) != 0) {
                            this.method_14(5);
                        }
                }
            }

            if ((short) ((byte) ((this.field_33 ^ this.field_32) & this.field_33)) != 0) {
                switch (this.field_20) {
                    case 5:
                        this.arr_class_1[this.field_37].method_117(this.field_32);
                        break;
                    case 32:
                        this.field_64 = this.field_32;
                }
            }

            this.field_33 = this.field_32;
        }
    }

    // $FF: renamed from: c (int) int
    public final int method_14(int paramInt) {
        int var2;
        switch (this.field_20) {
            case 1:
                this.field_20 = paramInt;
                paramInt = 30;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 41:
            case 42:
            case 43:
            default:
                break;
            case 3:
                this.field_24[0] = null;
                this.field_141 = 0;
                this.method_89(this.field_141);
                break;
            case 4:
                this.field_7 = false;

                for (var2 = 0; var2 < this.field_88.length; ++var2) {
                    this.field_88[var2] = new int[3];
                }

                if (this.isLevelm) {
                    this.method_22("/levelm", (byte) 32, (byte) 32);
                } else {
                    this.method_22("/level" + this.field_11, (byte) 32, (byte) 32);
                }

                this.field_101 = false;
                this.field_50 = 240 / this.field_57 + 2;
                this.field_51 = 320 / this.field_58 + 2;
                this.field_37 = 0;
                this.field_38 = 0;
                this.field_49 = 0;
                if (this.field_8) {
                    if (!this.field_7) {
                        if (this.isLevelm) {
                            this.method_82("MultiPlLevel");
                        } else {
                            this.method_82("CompanyLevel");
                        }
                    }

                    if (!this.isLevelm && this.field_49 == 0) {
                        while (this.field_92[this.field_93][0] == 0 || this.field_92[this.field_93][0] == 0) {
                            ++this.field_93;
                        }
                    }

                    this.arr_class_1[this.field_37].method_108(this.arr_class_1[this.field_37].field_159);
                } else {
                    this.arr_class_1[this.field_37].method_107();
                    if (this.field_11 != 1 && !this.field_100 && this.field_114) {
                        this.method_91();
                        this.field_114 = false;
                    }
                }

                if (!this.isLevelm) {
                    this.field_class5.method_203(this.field_92[this.field_93][2] + 128, 220, 50);
                    this.field_class5.setSomething(0);
                } else {
                    paramInt = 35;
                }
                break;
            case 26:
                this.method_91();
                break;
            case 29:
                this.method_86(61);
                this.method_77();
                break;
            case 39:
            case 40:
                this.method_90(this.field_141);
                break;
            case 44:
                try {
                    this.field_24[260] = null;
                    Runtime.getRuntime().gc();
                    this.method_9(3, 1);
                    this.field_109 = null;
                    System.gc();
                } catch (Exception var6) {
                    ;
                }
        }

        switch (paramInt) {
            case 1:
                this.field_48 = this.field_39.field_270;
                if (!this.field_7) {
                    this.field_39.method_192(27, false);
                } else {
                    this.field_39.method_192(27, true);
                }

                if (this.field_9 >= 0) {
                    this.field_39.method_192(29, false);
                } else {
                    this.field_39.method_192(29, true);
                }

                this.method_16(this.field_39);
                this.field_39.method_198();
                break;
            case 2:
                this.field_108 = 0;
                this.image = Image.createImage(400, 440);
                this.mapMask = new byte[20][22];
                this.field_72 = new byte[20][22];
                this.field_arr_class3_1 = new class_3[20];

                for (var2 = 0; var2 < 20; ++var2) {
                    class_3[] var10000 = this.field_arr_class3_1;
                    class_3 var10002 = new class_3();
                    var10000[var2] = var10002;
                }

                this.arr_class_1 = new class_1[2];

                for (var2 = 0; var2 < 2; ++var2) {
                    class_1[] var9 = this.arr_class_1;
                    class_1 var7 = new class_1();
                    var9[0] = var7;
                }

                class_1 var10001 = new class_1();
                this.field_class_1 = var10001;
                class_2 var8 = new class_2();
                this.field_class_2 = var8;
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 23:
            case 26:
            case 36:
            default:
                break;
            case 5:
                this.field_50 = 240 / this.field_57 + 2;
                this.field_51 = 320 / this.field_58 + 2;
                if (this.field_37 == this.field_38) {
                    this.method_86(61);
                } else {
                    this.method_86(56);
                }

                this.method_77();
                break;
            case 6:
                this.field_class5.method_203(99, 200, 204);
                this.field_class5.setSomething(0);
                this.method_87(67);
                break;
            case 7:
                this.field_class5.method_203(100, 224, 204);
                this.field_class5.setSomething(0);
                this.method_87(67);
                break;
            case 19:
                try {
                    this.reinitStreamAndRes("/resources.pak");
                    this.field_24 = new Image[this.field_23];
                    this.method_9(0, 1);
                } catch (Exception var4) {
                    ;
                }

                this.field_13 = 0;

                for (var2 = 1; var2 < field_138; ++var2) {
                    this.field_13 = (int) ((long) this.field_13 + this.field_22[var2][1]);
                }

                this.field_14 = this.field_13 + 6400;
                this.field_17 = System.currentTimeMillis() + 10000L;
                break;
            case 22:
                for (var2 = 0; var2 < this.field_40.field_265; ++var2) {
                    this.field_40.field_268[var2] = true;
                }

                if (this.field_38 == this.field_37) {
                    if (this.field_135 < 0 && this.arr_class_1[this.field_38].field_161 >= 0) {
                        this.field_135 = this.arr_class_1[this.field_38].field_161;
                    }

                    this.field_40.method_192(16, false);
                    this.field_40.method_192(17, false);
                    if (!this.isLevelm) {
                        this.field_40.method_192(19, false);
                    }

                    this.field_40.method_192(24, false);
                    this.field_40.method_192(15, false);
                    if (!this.isLevelm) {
                        this.field_40.method_192(21, false);
                    }

                    this.field_40.method_192(25, false);
                    this.field_40.method_192(22, false);
                    if (this.field_9 >= 0) {
                        this.field_40.method_192(23, false);
                    }

                    if (this.field_135 >= 0) {
                        this.field_40.method_192(20, false);
                    }

                    this.field_40.method_192(26, false);
                    if (this.arr_class_1[this.field_37].field_178 < 0 && this.arr_class_1[this.field_37].field_197 <= 0 && (this.arr_class_1[this.field_37].field_176[0] || this.arr_class_1[this.field_37].field_176[1] || this.arr_class_1[this.field_37].field_176[2])) {
                        this.field_40.method_192(18, false);
                        this.field_42.method_192(39, !this.arr_class_1[this.field_37].field_176[0]);
                        this.field_42.method_192(40, !this.arr_class_1[this.field_37].field_176[1]);
                        this.field_42.method_192(41, !this.arr_class_1[this.field_37].field_176[2]);
                        this.method_16(this.field_42);
                        this.field_42.method_198();
                    }

                    this.field_40.method_198();
                    this.method_16(this.field_40);
                    this.method_86(67);
                }
                break;
            case 24:
                this.field_43.method_192(45, this.field_10 <= 0);
                this.method_16(this.field_43);
                break;
            case 25:
                this.method_86(62);
                this.method_87(63);
                this.field_class5.method_203(102, 140, 0);
                break;
            case 27:
                this.field_8 = true;
                paramInt = 24;
                this.field_43.method_192(45, true);
                this.method_16(this.field_43);
                break;
            case 28:
                this.field_5 = 224 - 20 * this.mapCols;
                this.field_6 = 292 - 20 * this.mapRows;
                this.method_80();
                this.method_86(67);
                break;
            case 29:
                this.method_86(59);
                this.method_87(60);
                break;
            case 30:
                this.field_48 = 1;
                break;
            case 32:
                this.field_5 = 224 - 20 * this.mapCols;
                this.field_6 = 292 - 20 * this.mapRows;
                this.method_80();
                this.method_86(65);
                this.method_87(66);
                this.field_98 = 66;
                break;
            case 33:
                if (this.field_24[field_138] == null) {
                    this.field_class5.method_203(this.field_12, 220, 230 - this.field_class5.field_281);
                    this.field_class5.setSomething(0);
                    paramInt = 11;
                    this.field_110 = true;
                    this.field_14 = this.field_28 - this.field_13;
                    this.field_29 = 1;
                    this.method_90(0);
                    this.field_141 = 1;
                    this.field_soundPlayers[0] = null;
                    Runtime.getRuntime().gc();
                } else {
                    this.field_109 = null;
                    System.gc();
                    this.field_class5.method_203(this.field_12, 220, 230);
                }
                break;
            case 34:
                this.field_class5.method_203(103 + this.field_arr_class3_1[this.field_135].field_246, 220, 40);
                this.field_class5.setSomething(0);
                this.method_86(67);
                break;
            case 35:
                if (this.arr_class_1[this.field_37].field_167 == 0) {
                    this.field_class5.method_203(82, 210, 1);
                } else {
                    this.field_class5.method_203(83, 210, 1);
                }
                break;
            case 37:
                this.method_86(67);
                break;
            case 38:
                if (this.field_7) {
                    this.writeRecordStore();
                }

                this.method_90(this.field_141);
                break;
            case 39:
                this.field_class5.method_203(81, 140, 0);
                this.method_86(62);
                this.method_87(63);
                break;
            case 40:
                this.method_89(1);

                while (this.field_92[this.field_93][0] != -2) {
                    ++this.field_93;
                }

                this.field_class5.method_203(this.field_92[this.field_93][2] + 128, 220, 50);
                this.field_class5.setSomething(0);
                this.method_86(59);
                this.method_87(60);
                if (this.field_10 < this.field_11) {
                    this.field_10 = this.field_11;
                }
                break;
            case 41:
                this.method_89(2);
                this.field_93 = 0;
                this.field_class5.method_203(127, 220, 50);
                this.field_class5.setSomething(0);
                this.method_87(15);
                break;
            case 42:
                this.field_class5.method_203(79, 140, 0);
            case 31:
                this.method_86(62);
                this.method_87(63);
                break;
            case 43:
                if (this.field_37 == 0) {
                    this.field_115 = 85;
                } else {
                    this.field_115 = 84;
                }

                this.field_7 = true;
                this.method_87(60);

                try {
                    this.field_class5.method_203(this.field_115, 160, 0);
                    this.field_class5.setSomething(0);
                } catch (Exception var3) {
                    ;
                }
                break;
            case 44:
                try {
                    this.field_24[3] = null;
                    Runtime.getRuntime().gc();
                    this.method_9(260, 1);
                    this.field_109 = null;
                    System.gc();
                } catch (Exception var5) {
                    ;
                }
                break;
            case 45:
                for (var2 = 0; var2 < this.field_46.field_265; ++var2) {
                    this.field_46.field_268[var2] = var2 >= this.field_10;
                }

                this.method_16(this.field_46);
                break;
            case 46:
                this.field_class5.method_203(80, 140, 0);
                this.method_86(62);
                this.method_87(63);
        }

        this.field_21 = this.field_20;
        return this.field_20 = paramInt;
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, c, int, int) void
    public final void method_15(Graphics var1, class_4 var2, int var3, int var4) {
        this.method_17(var1, var2, var3, var4, var2.field_270, var2.field_271);
    }

    // $FF: renamed from: a (c) void
    public final void method_16(class_4 var1) {
        int var2;
        if ((var2 = var1.method_196(0, var1.field_265 - 1)) > var1.field_267) {
            var2 = var1.field_267;
        }

        int var3 = 0;

        for (int var5 = 0; var5 < var1.field_265; ++var5) {
            int var4;
            if (!var1.field_268[var5] && (var4 = this.field_class5.method_204(var1.field_272 + var5)) > var3) {
                var3 = var4;
            }
        }

        var1.field_270 = var3 + 10;
        var1.field_271 = var2 * 15 + 5;
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, c, int, int, int, int) void
    public final void method_17(Graphics var1, class_4 var2, int var3, int var4, int var5, int var6) {
        int var7 = var4 + 5;
        this.method_73(var1, var3 - 10, var4 - 10, var5 + 20, var6 + 20);
        int var8 = var2.field_266;
        int var9 = 0;
        var1.setColor(16776960);

        do {
            if (!var2.field_268[var8]) {
                if (var8 == var2.field_269) {
                    var1.setClip(0, 0, 240, 320);
                    var1.fillRect(var3 + 5, var7 - 2, var5 - 10, 15);
                }

                if (var9 < var2.field_267) {
                    this.field_class5.method_202(var1, var2.field_272 + var8, var3 + 5, var7, 4);
                    var7 += 15;
                }

                ++var9;
            }

            ++var8;
        } while (var8 < var2.field_265);

        if (var9 + var2.field_266 > var2.field_267) {
            var1.setClip(0, 0, 240, 320);
            var1.drawImage(this.field_24[5], var3 + var5, var4, 24);
            var1.drawImage(this.field_24[4], var3 + var5, var4 + var6, 40);
        }

    }

    // $FF: renamed from: a () boolean
    public final boolean method_18() {
        class_1 var1 = this.arr_class_1[this.field_38].method_122();
        int var2 = 0;
        boolean var3 = false;
        int var4;
        switch (this.field_117) {
            case 0:
                for (var4 = var1.field_159; var4 < var1.field_159 + var1.field_160; ++var4) {
                    if (!this.field_arr_class3_1[var4].field_242) {
                        return false;
                    }
                }

                return true;
            case 1:
                for (var4 = 0; var4 < this.field_119; ++var4) {
                    if (this.field_arr_class3_2[var4].field_242) {
                        ++var2;
                    }
                }

                if (var2 >= this.field_118) {
                    return true;
                }
                break;
            case 2:
                for (var4 = 0; var4 < this.field_119; ++var4) {
                    if (this.field_arr_class3_2[var4].field_236 >= this.field_121 && this.field_arr_class3_2[var4].field_236 <= this.field_123 && this.field_arr_class3_2[var4].field_237 >= this.field_122 && this.field_arr_class3_2[var4].field_237 <= this.field_124) {
                        ++var2;
                    }
                }

                if (var2 >= this.field_118) {
                    return true;
                }
                break;
            case 3:
                for (var4 = 0; var4 < 15; ++var4) {
                    if (!var1.field_150[var4] && this.arr_class_1[this.field_38].field_149[var4][0] >= this.field_121 && this.arr_class_1[this.field_38].field_149[var4][0] <= this.field_123 && this.arr_class_1[this.field_38].field_149[var4][1] >= this.field_122 && this.arr_class_1[this.field_38].field_149[var4][1] <= this.field_124) {
                        return true;
                    }
                }
        }

        return false;
    }

    // $FF: renamed from: b () boolean
    public final boolean method_19() {
        int var1 = 0;
        int var2;
        if (!this.isLevelm) {
            switch (this.field_125) {
                case 1:
                    for (var2 = 0; var2 < this.field_127; ++var2) {
                        if (this.field_arr_class3_3[var2].field_242) {
                            ++var1;
                        }
                    }

                    if (var1 >= this.field_126) {
                        return true;
                    }
                    break;
                case 2:
                    for (var2 = 0; var2 < this.field_127; ++var2) {
                        if (this.field_arr_class3_3[var2].field_236 >= this.field_129 && this.field_arr_class3_3[var2].field_236 <= this.field_131 && this.field_arr_class3_3[var2].field_237 >= this.field_130 && this.field_arr_class3_3[var2].field_237 <= this.field_132) {
                            ++var1;
                        }
                    }

                    if (var1 >= this.field_126) {
                        return true;
                    }
            }
        }

        for (var2 = this.arr_class_1[this.field_38].field_159; var2 < this.arr_class_1[this.field_38].field_159 + this.arr_class_1[this.field_38].field_160; ++var2) {
            if (!this.field_arr_class3_1[var2].field_242) {
                return false;
            }
        }

        return true;
    }

    // $FF: renamed from: i () void
    public final void method_20() {
        if (this.method_18()) {
            if (this.isLevelm) {
                this.method_14(43);
            } else {
                this.method_14(40);
            }
        } else if (this.method_19()) {
            if (this.isLevelm) {
                this.method_14(43);
            } else {
                this.method_14(41);
            }
        } else {
            this.field_37 = (this.field_37 + 1) % 2;
            this.method_57();
            if (this.isLevelm) {
                this.field_38 = this.arr_class_1[this.field_37].field_167;
            } else {
                this.field_38 = 0;
            }

            ++this.field_49;
            int var1;
            if ((var1 = this.arr_class_1[this.field_37].method_107()) >= 0) {
                this.method_63(var1, true);
            }

            if (!this.isLevelm) {
                if (this.field_49 >> 1 == this.field_92[this.field_93][0] && this.field_92[this.field_93][0] >= 0) {
                    this.field_class5.method_203(this.field_92[this.field_93][2] + 128, 220, 50);
                    this.field_class5.setSomething(0);
                    this.method_14(29);
                } else {
                    this.method_14(5);
                }
            } else {
                this.method_14(35);
            }
        }
    }

    // $FF: renamed from: a (short) void
    public final void method_21(short var1) {
        class_4 var2 = this.field_39;
        switch (this.field_20) {
            case 1:
                break;
            case 20:
                var2 = this.field_41;
                break;
            case 21:
                var2 = this.field_44;
                break;
            case 22:
                var2 = this.field_40;
                break;
            case 23:
                var2 = this.field_42;
                break;
            case 24:
                var2 = this.field_43;
                break;
            case 36:
                var2 = this.field_45;
                break;
            case 45:
                var2 = this.field_46;
                break;
            default:
                return;
        }

        switch (var1) {
            case 4:
                var2.method_199(true);
                return;
            case 8:
                var2.method_199(false);
                return;
            case 16:
                if (this.field_141 != 0 || this.field_soundPlayers[this.field_141].getState() != 400) {
                    this.method_89(7);
                }

                switch (this.field_20) {
                    case 1:
                        switch (this.field_39.field_272 + this.field_39.field_269) {
                            case 27:
                                this.method_14(5);
                                break;
                            case 28:
                                this.method_14(24);
                                break;
                            case 29:
                                this.method_14(27);
                                break;
                            case 30:
                                this.method_14(6);
                                break;
                            case 31:
                                this.method_14(21);
                                break;
                            case 32:
                                this.method_14(7);
                                break;
                            case 33:
                                this.method_14(38);
                        }

                        return;
                    case 20:
                        boolean var3 = false;
                        byte var4 = 0;
                        if (this.field_41.field_272 + this.field_41.field_269 != 34) {
                            this.method_64(this.field_class_3, false);
                        }

                        int var5;
                        int var6;
                        int var7;
                        switch (this.field_41.field_272 + this.field_41.field_269) {
                            case 35:
                                for (var5 = class_3.field_229.length - 2; var5 >= 0; var5 -= 2) {
                                    var6 = this.field_class_3.field_236 + class_3.field_229[var5][0];
                                    var7 = this.field_class_3.field_237 + class_3.field_229[var5][1];
                                    if (this.field_class_3.method_172(var6, var7)) {
                                        var3 = true;
                                        this.method_66(var6, var7, (byte) this.field_class_3.field_258);
                                    }
                                }

                                var4 = 20;
                                break;
                            case 36:
                                for (var5 = class_3.field_229.length - 2; var5 >= 0; var5 -= 2) {
                                    var6 = this.field_class_3.field_236 + class_3.field_229[var5][0];
                                    var7 = this.field_class_3.field_237 + class_3.field_229[var5][1];
                                    if (this.field_class_3.method_168(var6, var7)) {
                                        var3 = true;
                                        this.method_66(var6, var7, (byte) this.field_class_3.field_258);
                                    }
                                }

                                var4 = 19;
                                break;
                            case 37:
                                for (var5 = class_3.field_229.length - 2; var5 >= 0; var5 -= 2) {
                                    var6 = this.field_class_3.field_236 + class_3.field_229[var5][0];
                                    var7 = this.field_class_3.field_237 + class_3.field_229[var5][1];
                                    if (this.field_class_3.method_165(var6, var7)) {
                                        var3 = true;
                                        this.method_66(var6, var7, (byte) this.field_class_3.field_258);
                                    }
                                }

                                var4 = 17;
                                break;
                            case 38:
                                for (var5 = class_3.field_229.length - 2; var5 >= 0; var5 -= 2) {
                                    var6 = this.field_class_3.field_236 + class_3.field_229[var5][0];
                                    var7 = this.field_class_3.field_237 + class_3.field_229[var5][1];
                                    if (this.field_class_3.method_170(var6, var7)) {
                                        var3 = true;
                                        this.method_66(var6, var7, (byte) this.field_class_3.field_258);
                                    }
                                }

                                var4 = 18;
                        }

                        if (var3) {
                            this.arr_class_1[this.field_37].method_116(this.field_class_3, var4);
                        }

                        this.field_20 = 5;
                        return;
                    case 21:
                        switch (this.field_44.field_272 + this.field_44.field_269) {
                            case 51:
                            case 52:
                                this.field_44.method_192(51, this.field_30);
                                this.field_30 = !this.field_30;
                                this.method_90(this.field_141);
                                this.field_44.method_192(52, this.field_30);
                                if (this.field_30) {
                                    --this.field_44.field_269;
                                } else {
                                    ++this.field_44.field_269;
                                }

                                this.method_16(this.field_44);
                                break;
                            case 53:
                            case 54:
                                this.field_44.method_192(53, this.field_31);
                                this.field_31 = !this.field_31;
                                this.field_44.method_192(54, this.field_31);
                                if (this.field_31) {
                                    --this.field_44.field_269;
                                } else {
                                    ++this.field_44.field_269;
                                }

                                this.method_16(this.field_44);
                                break;
                            case 55:
                                this.method_14(1);
                        }

                        return;
                    case 22:
                        switch (this.field_40.field_272 + this.field_40.field_269) {
                            case 15:
                                this.method_14(5);
                                break;
                            case 16:
                                this.method_20();
                                break;
                            case 17:
                                this.method_14(28);
                                break;
                            case 18:
                                this.method_14(23);
                                break;
                            case 19:
                                this.field_95 = this.field_93;
                                this.field_93 = 1;
                                this.field_class5.method_203(this.field_92[this.field_93][2] + 128, 220, 50);
                                this.field_class5.setSomething(0);
                                this.method_14(29);
                                break;
                            case 20:
                                this.method_14(34);
                                break;
                            case 21:
                                this.method_14(37);
                                break;
                            case 22:
                                this.method_14(26);
                                break;
                            case 23:
                                this.method_14(46);
                                break;
                            case 24:
                                this.method_14(1);
                                break;
                            case 25:
                                this.field_7 = true;
                                this.method_14(42);
                                break;
                            case 26:
                                this.method_14(31);
                        }

                        return;
                    case 23:
                        switch (this.field_42.field_272 + this.field_42.field_269) {
                            case 39:
                                this.field_47 = 0;
                                this.method_14(32);
                                break;
                            case 40:
                                this.field_47 = 1;
                                this.method_14(32);
                                break;
                            case 41:
                                this.field_47 = 2;
                                this.method_14(32);
                                break;
                            case 42:
                                this.method_14(22);
                        }

                        return;
                    case 24:
                        switch (this.field_43.field_272 + this.field_43.field_269) {
                            case 43:
                                this.isLevelm = false;
                                this.field_100 = false;
                                if (this.field_8) {
                                    if (this.field_9 < 0 || this.field_9 == 100) {
                                        this.field_9 = 1;
                                    }

                                    this.field_11 = this.field_9;
                                    this.field_12 = 117 + this.field_11 - 1;
                                    this.method_14(33);
                                } else {
                                    this.field_11 = 1;
                                    this.field_101 = true;
                                    this.method_14(36);
                                }
                                break;
                            case 44:
                                this.isLevelm = true;
                                this.field_100 = false;
                                this.field_12 = 116;
                                this.method_14(33);
                                break;
                            case 45:
                                this.isLevelm = false;
                                this.field_100 = true;
                                this.method_14(45);
                                break;
                            case 46:
                                this.field_8 = false;
                                this.method_14(1);
                        }

                        return;
                    case 36:
                        if (this.field_45.field_272 + this.field_45.field_269 == 50) {
                            this.method_14(24);
                            return;
                        }

                        this.field_12 = 117;
                        this.method_14(33);
                        this.field_106 = this.field_45.field_269;
                        return;
                    case 45:
                        this.field_11 = this.field_46.field_269 + 1;
                        this.method_14(36);
                        return;
                    default:
                        return;
                }
            case 32:
                if (this.field_20 == 22) {
                    this.method_14(5);
                    return;
                }

                if (this.field_20 == 23) {
                    this.method_14(22);
                    return;
                }
        }

    }

    // $FF: renamed from: a (java.lang.String, byte, byte) void
    public final void method_22(String strLevelParam, byte paramByte_1, byte paramByte_2) {
        this.field_57 = paramByte_1;
        this.field_58 = paramByte_2;
        this.loadMap(strLevelParam);
        this.field_78 = paramByte_1 >> 1;
        this.field_79 = paramByte_2 >> 1;
        this.field_80 = paramByte_1 / 4;
        this.field_81 = paramByte_2 / 4;
        this.field_55 = this.mapCols * paramByte_1;
        this.field_56 = this.mapRows * paramByte_2;
        this.field_61 = this.field_55 - 240;
        this.field_62 = this.field_56 - 320;
        this.field_67 = this.field_69 = 1 * paramByte_1;
        this.field_68 = 5 * paramByte_1 + this.field_78;
        this.field_70 = 7 * paramByte_2 + this.field_79;
        this.field_75 = 6 * paramByte_1;
        this.field_76 = 6 * paramByte_2;
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
    public final void method_23(Graphics var1, int var2, int var3, int var4, int var5) {
        int var6 = this.mapMask[var2][var3];
        int var7 = this.field_111;
        if (var6 < 0) {
            var6 = -var6;
            var7 = this.field_112;
        }

        if (var6 == 73) {
            var7 = this.field_112;
        }

        byte var8;
        if ((var8 = this.method_55(var2, var3)) == 3 || var8 == 5 || var8 == 4) {
            var1.drawImage(this.field_24[69 + var7], var4, var5, 0);
        }

        if (var6 != 69 && var6 != 73) {
            var1.drawImage(this.field_24[var6], var4, var5, 0);
        }

    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
    public final void method_24(Graphics var1) {
        int var2 = this.field_59 / this.field_57;
        int var3 = this.field_60 / this.field_58;
        int var4 = this.field_50;
        int var5 = this.field_51;
        int var6 = this.field_59 % this.field_57;
        int var7 = this.field_60 % this.field_58;
        if (var2 + var4 >= this.mapCols) {
            var4 = this.mapCols - var2;
        }

        if (var3 + var5 >= this.mapRows) {
            var5 = this.mapRows - var3;
        }

        int var8 = 0;
        int var9 = 0;
        class_1 var10 = this.arr_class_1[this.field_38];
        class_1 var11 = this.arr_class_1[this.field_37];

        int var12;
        int var13;
        for (var12 = 0; var12 < var4; ++var12) {
            for (var13 = 0; var13 < var5; ++var13) {
                if (var10.field_172[var2 + var12][var3 + var13]) {
                    this.method_23(var1, var2 + var12, var3 + var13, var9 - var6, var8 - var7);
                }

                var8 += this.field_58;
            }

            var8 = 0;
            var9 += this.field_57;
        }

        var1.drawImage(this.field_24[2], 0, 0, 0);
        var9 = 0;

        int var14;
        for (var13 = 0; var13 < var4; ++var13) {
            for (var14 = 0; var14 < var5; ++var14) {
                if (!var10.field_172[var2 + var13][var3 + var14]) {
                    this.method_23(var1, var2 + var13, var3 + var14, var9 - var6, var8 - var7);
                }

                if (var11.field_161 < 0) {
                    var8 += this.field_58;
                } else {
                    if (this.field_72[var2 + var13][var3 + var14] > -1 && this.field_37 == this.field_38) {
                        if (this.field_72[var2 + var13][var3 + var14] < this.field_arr_class3_1[this.arr_class_1[this.field_37].field_161].field_258) {
                            var1.setColor(16711680);
                            var12 = 0;
                        } else {
                            var1.setColor('\uff00');
                            var12 = this.field_arr_class3_1[this.arr_class_1[this.field_37].field_161].field_258;
                        }

                        if (this.method_58(var2 + var13 - 1, var3 + var14) < var12) {
                            var1.drawLine(var9 - var6, var8 - var7, var9 - var6, var8 - var7 + this.field_58 - 1);
                        }

                        if (this.method_58(var2 + var13 + 1, var3 + var14) < var12) {
                            var1.drawLine(var9 + this.field_57 - var6 - 1, var8 - var7, var9 + this.field_57 - var6 - 1, var8 - var7 + this.field_58 - 1);
                        }

                        if (this.method_58(var2 + var13, var3 + var14 - 1) < var12) {
                            var1.drawLine(var9 - var6, var8 - var7, var9 + this.field_57 - var6 - 1, var8 - var7);
                        }

                        if (this.method_58(var2 + var13, var3 + var14 + 1) < var12) {
                            var1.drawLine(var9 - var6, var8 - var7 + this.field_58 - 1, var9 - var6 + this.field_57 - 1, var8 - var7 + this.field_58 - 1);
                        }
                    }

                    var8 += this.field_58;
                }
            }

            var8 = 0;
            var9 += this.field_57;
        }

        var9 = 0;

        for (var13 = 0; var13 < var4; ++var13) {
            for (var14 = 0; var14 < var5; ++var14) {
                if (var10.field_172[var2 + var13][var3 + var14] && (var13 - 1 >= 0 && !this.arr_class_1[this.field_38].field_172[var2 + var13 - 1][var3 + var14] || var13 + 1 < var4 && !this.arr_class_1[this.field_38].field_172[var2 + var13 + 1][var3 + var14] || var14 - 1 >= 0 && !this.arr_class_1[this.field_38].field_172[var2 + var13][var3 + var14 - 1] || var14 + 1 < var5 && !this.arr_class_1[this.field_38].field_172[var2 + var13][var3 + var14 + 1])) {
                    var1.drawImage(this.field_24[256], var9 - var6 - 4, var8 - var7 - 4, 0);
                }

                var8 += this.field_58;
            }

            var8 = 0;
            var9 += this.field_57;
        }

        for (var13 = this.field_86 - 1; var13 >= 0; --var13) {
            class_3 var20;
            if (var13 != var11.field_161 && (var20 = this.field_arr_class3_1[var13]).field_242 && !var10.field_172[var20.field_236][var20.field_237]) {
                var1.drawImage(this.field_24[var20.field_238 + var20.field_241], var20.field_234 - this.field_59 + this.field_78, var20.field_235 - this.field_60 + this.field_78, 3);
            }
        }

        class_1 var21 = var10.method_122();

        for (var14 = 14; var14 >= 0; --var14) {
            this.method_25(var1, var10, var14, var2, var3, var4, var5);
            if (var21.field_151[var14]) {
                this.method_25(var1, var21, var14, var2, var3, var4, var5);
            }
        }

        class_3 var15;
        for (var14 = this.field_86 - 1; var14 >= 0; --var14) {
            var15 = this.field_arr_class3_1[var14];
            if (!this.field_arr_class3_1[var14].field_242 && !var10.field_172[var15.field_236][var15.field_237]) {
                if (var15.field_250 == 0) {
                    if (var15.field_230) {
                        var1.drawImage(this.field_24[var15.field_238 + class_3.field_219[var15.field_247]], var15.field_234 - this.field_59 + this.field_78, var15.field_235 - this.field_60 + this.field_78, 3);
                    } else if (var15.field_260) {
                        if (++this.field_102 > 3) {
                            this.field_102 = 0;
                        }

                        var1.drawImage(this.field_24[var15.field_238 + class_3.field_220[var15.field_247 >> 1] + this.field_102], var15.field_234 - this.field_59 + this.field_78, var15.field_235 - this.field_60 + this.field_78, 3);
                    } else {
                        var1.drawImage(this.field_24[var15.field_238 + var15.field_241], var15.field_234 - this.field_59 + this.field_78, var15.field_235 - this.field_60 + this.field_78, 3);
                    }
                } else {
                    var1.drawImage(this.field_24[var15.field_238 + var15.field_241], var15.field_234 - this.field_59 + this.field_78, var15.field_235 - this.field_60 + this.field_78, 3);
                }

                if (this.field_37 == this.field_38 && var15.field_263 == this.field_38 && !var15.field_260) {
                    if (!var15.field_232 && var14 != var10.field_161) {
                        var1.drawImage(this.field_24[107], var15.field_234 - this.field_59 + this.field_57, var15.field_235 - this.field_60, 24);
                    }

                    if (var14 == var10.field_161 && this.field_82 % 2 == 0) {
                        var1.drawImage(this.field_24[106], var15.field_234 - this.field_59 + this.field_57, var15.field_235 - this.field_60, 24);
                    }
                }
            }
        }

        var1.setColor(0);

        for (var14 = this.field_86 - 1; var14 >= 0; --var14) {
            this.method_26(var1, var10, var14, this.field_57 - 1);
        }

        var1.setColor(172);

        for (var14 = this.arr_class_1[0].field_160 - 1; var14 >= 0; --var14) {
            this.method_26(var1, var10, var14, -1);
        }

        var1.setColor(11272192);

        for (var14 = this.arr_class_1[1].field_159; var14 < this.arr_class_1[1].field_159 + this.arr_class_1[1].field_160; ++var14) {
            this.method_26(var1, var10, var14, -1);
        }

        var1.setColor(11184810);

        for (var14 = this.field_87; var14 < this.field_86; ++var14) {
            this.method_26(var1, var10, var14, -1);
        }

        for (var14 = 0; var14 <= 1; ++var14) {
            class_1 var19;
            if ((var19 = this.arr_class_1[var14]).field_178 >= 0 && (this.field_38 == var14 || !var10.field_172[var19.field_179][var19.field_180])) {
                if (var19.field_187 > 0) {
                    if (var19.field_178 == 1) {
                        var1.drawImage(this.field_24[177], var19.field_181 + this.field_78 - this.field_59, var19.field_182 + this.field_58 / 2 - this.field_60, 3);
                    } else {
                        var1.drawImage(this.field_24[176], var19.field_181 + this.field_78 + 1 - this.field_59, var19.field_182 + this.field_58 / 2 - this.field_60, 3);
                    }
                } else if (var19.field_178 == 1) {
                    var1.drawImage(this.field_24[237], var19.field_181 + this.field_78 - this.field_59, var19.field_182 + this.field_58 / 2 - this.field_60, 3);
                } else {
                    var1.drawImage(this.field_24[236], this.arr_class_1[var14].field_181 + this.field_78 - this.field_59, this.arr_class_1[var14].field_182 + this.field_58 / 2 - this.field_60, 3);
                }
            }
        }

        if ((this.field_32 & 128) != 0 && this.field_37 == this.field_38) {
            var14 = this.field_135;
            if (this.field_135 < 0) {
                var14 = this.arr_class_1[this.field_37].field_161;
            }

            if (var14 >= 0 && !(var15 = this.field_arr_class3_1[var14]).field_242 && !var10.field_172[var15.field_236][var15.field_237]) {
                int var16 = var15.field_254;
                var1.setColor(16711680);

                for (int var17 = 0; var17 < this.field_87; ++var17) {
                    class_3 var18;
                    if (var17 != var14 && !(var18 = this.field_arr_class3_1[var17]).field_242 && var15.field_263 != var18.field_263 && !var10.field_172[var18.field_236][var18.field_237] && var15.method_162(var18)) {
                        this.method_27(var1, var18.field_234, var18.field_235);
                    }
                }

                var16 *= this.field_57;
                var1.drawArc(var15.field_234 - this.field_59 + (this.field_57 >> 1) - var16, var15.field_235 - this.field_60 + (this.field_58 >> 1) - var16, var16 + var16, var16 + var16, 0, 360);
            }
        }

        if (this.field_136 >= 0 && this.field_37 == this.field_38) {
            var1.setColor(0);
            var1.fillRect(222, 280, 18, 20);
            var1.setColor(16711680);
            var1.drawString("" + this.field_137, 227, 281, 0);
        }

        var1.setColor(16777215);
        if (this.field_37 == this.field_38 || this.field_77 == 2) {
            switch (this.field_77) {
                case 0:
                    return;
                case 1:
                default:
                    var1.drawLine(this.field_75 - this.field_59 - this.field_82, this.field_76 - this.field_60 - this.field_82, this.field_75 - this.field_59 + this.field_80 - this.field_82, this.field_76 - this.field_60 - this.field_82);
                    var1.drawLine(this.field_75 - this.field_59 - this.field_82, this.field_76 - this.field_60 - this.field_82, this.field_75 - this.field_59 - this.field_82, this.field_76 - this.field_60 - this.field_82 + this.field_81);
                    var1.drawLine(this.field_75 - this.field_59 - this.field_82, this.field_76 - this.field_60 + this.field_82 + this.field_58, this.field_75 - this.field_59 + this.field_80 - this.field_82, this.field_76 - this.field_60 + this.field_82 + this.field_58);
                    var1.drawLine(this.field_75 - this.field_59 - this.field_82, this.field_76 - this.field_60 + this.field_82 + this.field_58, this.field_75 - this.field_59 - this.field_82, this.field_76 - this.field_60 + this.field_82 - this.field_81 + this.field_58);
                    var1.drawLine(this.field_75 - this.field_59 + this.field_82 + this.field_57, this.field_76 - this.field_60 - this.field_82, this.field_75 - this.field_59 + this.field_57 - this.field_80 + this.field_82, this.field_76 - this.field_60 - this.field_82);
                    var1.drawLine(this.field_75 - this.field_59 + this.field_82 + this.field_57, this.field_76 - this.field_60 - this.field_82, this.field_75 - this.field_59 + this.field_57 + this.field_82, this.field_76 - this.field_60 - this.field_82 + this.field_81);
                    var1.drawLine(this.field_75 - this.field_59 + this.field_82 + this.field_57, this.field_76 - this.field_60 + this.field_82 + this.field_58, this.field_75 - this.field_59 + this.field_57 - this.field_80 + this.field_82, this.field_76 - this.field_60 + this.field_58 + this.field_82);
                    var1.drawLine(this.field_75 - this.field_59 + this.field_82 + this.field_57, this.field_76 - this.field_60 + this.field_82 + this.field_58, this.field_75 - this.field_59 + this.field_57 + this.field_82, this.field_76 - this.field_60 + this.field_82 + this.field_58 - this.field_81);
                    break;
                case 2:
                    var1.setColor(16711680);
                    this.method_27(var1, this.field_75, this.field_76);
                    return;
                case 3:
                    this.field_83 = (this.field_83 + 1) % 6;
                    var1.drawImage(this.field_24[117 + this.field_83 / 2], this.field_75 - this.field_59 + 1, this.field_76 - this.field_60 + 1, 0);
                    return;
            }
        }

    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, e, int, int, int, int, int) void
    public final void method_25(Graphics var1, class_1 var2, int var3, int var4, int var5, int var6, int var7) {
        if (!var2.field_150[var3]) {
            int var8 = var2.field_149[var3][0];
            int var9 = var2.field_149[var3][1];
            if (var8 >= var4 && var8 < var4 + var6 && var9 >= var5 && var9 < var5 + var7) {
                var1.drawImage(this.field_24[225], this.method_39(var8) - this.field_59 + (this.field_57 >> 1), this.method_40(var9) - this.field_60 + (this.field_58 >> 1), 3);
            }
        }

    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, e, int, int) void
    public final void method_26(Graphics var1, class_1 var2, int var3, int var4) {
        class_3 var5;
        if (!(var5 = this.field_arr_class3_1[var3]).field_242 && !var2.field_172[var5.field_236][var5.field_237]) {
            if (var4 < 0) {
                var4 = (this.field_57 - 1) * var5.field_259 / var5.field_257;
            }

            var1.fillRect(var5.field_234 - this.field_59 + 1, var5.field_235 - this.field_60 - 3, var4, 3);
        }

    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
    public final void method_27(Graphics var1, int var2, int var3) {
        var1.drawImage(this.field_24[120], var2 - this.field_59 + 4, var3 - this.field_60 + 4, 0);
    }

    // $FF: renamed from: b (short) void
    public final void method_28(short var1) {
        this.method_31((short) (this.field_64 ^ var1));
        if (var1 <= 15) {
            this.field_77 = 1;
        }

        this.field_64 = var1;
    }

    // $FF: renamed from: a (int) void
    public final void method_29(int var1) {
        if (timeMillis > this.field_84) {
            this.field_82 = (this.field_82 + 1) % 2;
            this.field_84 = timeMillis + 100L;
        }

        if ((this.field_63 & 15) != 0) {
            if ((this.field_63 & 1) != 0) {
                this.field_75 -= this.field_65++;
            } else if ((this.field_63 & 2) != 0) {
                this.field_75 += this.field_65++;
            }

            if ((this.field_63 & 4) != 0) {
                this.field_76 -= this.field_66++;
            } else if ((this.field_63 & 8) != 0) {
                this.field_76 += this.field_66++;
            }

            this.method_30(this.field_75, this.field_76);
            if (this.field_63 != this.field_64) {
                if (this.field_75 % this.field_57 == 0 && this.field_63 != 0) {
                    this.field_63 = (short) (this.field_63 & -2);
                    this.field_63 = (short) (this.field_63 & -3);
                    if (this.field_63 == 0) {
                        this.method_77();
                    }
                } else if ((this.field_64 & 1) == 0 && (this.field_64 & 2) == 0) {
                    if ((this.field_63 & 2) != 0) {
                        this.field_65 = (this.field_57 - this.field_75 % this.field_57) / 3 + 1;
                    } else if ((this.field_63 & 1) != 0) {
                        this.field_65 = this.field_75 % this.field_57 / 3 + 1;
                    }
                }

                if (this.field_76 % this.field_58 == 0 && this.field_63 != 0) {
                    this.field_63 = (short) (this.field_63 & -5);
                    this.field_63 = (short) (this.field_63 & -9);
                    if (this.field_63 == 0) {
                        this.method_77();
                    }
                } else if ((this.field_64 & 4) == 0 && (this.field_64 & 8) == 0) {
                    if ((this.field_63 & 8) != 0) {
                        this.field_66 = (this.field_58 - this.field_76 % this.field_58) / 3 + 1;
                    } else if ((this.field_63 & 4) != 0) {
                        this.field_66 = this.field_76 % this.field_58 / 3 + 1;
                    }
                }
            }

            if (this.field_65 > var1) {
                this.field_65 = var1;
            }

            if (this.field_66 > var1) {
                this.field_66 = var1;
            }
        }

    }

    // $FF: renamed from: a (int, int) void
    public final void method_30(int var1, int var2) {
        this.field_75 = var1;
        this.field_76 = var2;
        this.field_75 = this.method_33(this.field_75);
        this.field_76 = this.method_34(this.field_76);
        if (this.field_75 - this.field_59 < this.field_67) {
            this.field_59 = this.field_75 - this.field_67;
        }

        if (this.field_75 > this.field_59 + this.field_68) {
            this.field_59 = this.field_75 - this.field_68;
        }

        if (this.field_76 - this.field_60 < this.field_69) {
            this.field_60 = this.field_76 - this.field_69;
        }

        if (this.field_76 > this.field_60 + this.field_70) {
            this.field_60 = this.field_76 - this.field_70;
        }

        this.field_59 = this.method_35(this.field_59);
        this.field_60 = this.method_36(this.field_60);
    }

    // $FF: renamed from: c (short) void
    private void method_31(short var1) {
        this.field_63 |= (short) (var1 & 15);
        if ((var1 & 1) != 0) {
            this.field_63 = (short) (this.field_63 & -3);
        } else if ((var1 & 2) != 0) {
            this.field_63 = (short) (this.field_63 & -2);
        }

        if ((var1 & 4) != 0) {
            this.field_63 = (short) (this.field_63 & -9);
        } else {
            if ((var1 & 8) != 0) {
                this.field_63 = (short) (this.field_63 & -5);
            }

        }
    }

    // $FF: renamed from: a (int, int) short
    public final short method_32(int var1, int var2) {
        int var3 = var1 - this.method_47();
        int var4 = var2 - this.method_48();
        if ((this.field_63 & 2) != 0) {
            --var3;
        }

        if ((this.field_63 & 8) != 0) {
            --var4;
        }

        if (Math.abs(var3) < 2 && this.field_65 > 4) {
            this.field_65 = 4;
        }

        if (Math.abs(var4) < 2 && this.field_66 > 4) {
            this.field_66 = 4;
        }

        if (var3 > 0) {
            this.field_64 = (short) (this.field_64 | 2);
            if ((this.field_64 & 1) != 0) {
                this.field_65 = this.field_65 / 2 + 1;
                this.field_64 = (short) (this.field_64 & -2);
            }
        } else if (var3 < 0) {
            this.field_64 = (short) (this.field_64 | 1);
            if ((this.field_64 & 2) != 0) {
                this.field_65 = this.field_65 / 2 + 1;
                this.field_64 = (short) (this.field_64 & -3);
            }
        } else {
            this.field_64 = (short) (this.field_64 & -4);
        }

        if (var4 < 0) {
            this.field_64 = (short) (this.field_64 | 4);
            if ((this.field_64 & 8) != 0) {
                this.field_66 = this.field_66 / 2 + 1;
                this.field_64 = (short) (this.field_64 & -9);
            }
        } else if (var4 > 0) {
            this.field_64 = (short) (this.field_64 | 8);
            if ((this.field_64 & 4) != 0) {
                this.field_66 = this.field_66 / 2 + 1;
                this.field_64 = (short) (this.field_64 & -5);
            }
        } else {
            this.field_64 = (short) (this.field_64 & -13);
        }

        this.method_31(this.field_64);
        return (short) (this.field_63 & 15);
    }

    // $FF: renamed from: d (int) int
    public final int method_33(int var1) {
        return var1 < 0 ? 0 : (var1 > this.field_55 - this.field_57 ? this.field_55 - this.field_57 : var1);
    }

    // $FF: renamed from: e (int) int
    public final int method_34(int var1) {
        return var1 < 0 ? 0 : (var1 > this.field_56 - this.field_58 ? this.field_56 - this.field_58 : var1);
    }

    // $FF: renamed from: f (int) int
    public final int method_35(int var1) {
        return var1 < 0 ? 0 : (var1 > this.field_61 ? this.field_61 : (var1 += var1 % 2));
    }

    // $FF: renamed from: g (int) int
    public final int method_36(int var1) {
        return var1 < 0 ? 0 : (var1 > this.field_62 ? this.field_62 : (var1 += var1 % 2));
    }

    // $FF: renamed from: h (int) int
    public final int method_37(int var1) {
        return var1 < 0 ? 0 : (var1 >= this.mapCols ? this.mapCols - 1 : var1);
    }

    // $FF: renamed from: i (int) int
    public final int method_38(int var1) {
        return var1 < 0 ? 0 : (var1 >= this.mapRows ? this.mapRows - 1 : var1);
    }

    // $FF: renamed from: j (int) int
    public final int method_39(int var1) {
        return var1 * this.field_57;
    }

    // $FF: renamed from: k (int) int
    public final int method_40(int var1) {
        return var1 * this.field_58;
    }

    // $FF: renamed from: l (int) int
    public final int method_41(int var1) {
        return var1 / this.field_57;
    }

    // $FF: renamed from: m (int) int
    public final int method_42(int var1) {
        return var1 / this.field_58;
    }

    // $FF: renamed from: n (int) int
    public final int method_43(int var1) {
        return var1 * this.field_57 - this.field_59;
    }

    // $FF: renamed from: o (int) int
    public final int method_44(int var1) {
        return var1 * this.field_58 - this.field_60;
    }

    // $FF: renamed from: p (int) int
    public final int method_45(int var1) {
        return var1 / this.field_57 * this.field_57;
    }

    // $FF: renamed from: q (int) int
    public final int method_46(int var1) {
        return var1 / this.field_58 * this.field_58;
    }

    // $FF: renamed from: a () int
    public final int method_47() {
        return this.field_75 / this.field_57;
    }

    // $FF: renamed from: b () int
    public final int method_48() {
        return this.field_76 / this.field_58;
    }

    // $FF: renamed from: a (int, int) boolean
    public final boolean method_49(int var1, int var2) {
        return var1 >= 0 && var1 < this.mapCols && var2 >= 0 && var2 < this.mapRows;
    }

    // $FF: renamed from: b (int, int) void
    public final void method_50(int var1, int var2) {
        if (this.method_55(var1, var2) == 5) {
            switch (this.mapMask[var1][var2]) {
                case 16:
                    this.mapMask[var1][var2] = 19;
                    break;
                case 17:
                    this.mapMask[var1][var2] = 20;
                    break;
                case 18:
                    this.mapMask[var1][var2] = 21;
            }

            this.method_50(var1 + 1, var2);
            this.method_50(var1 - 1, var2);
            this.method_50(var1, var2 - 1);
            this.method_50(var1, var2 + 1);
        }
    }

    // $FF: renamed from: c (int, int) void
    public final void method_51(int var1, int var2) {
        this.method_52(var1, var2);

        int var3;
        for (var3 = 0; var3 < this.field_86; ++var3) {
            if (this.method_55(this.field_arr_class3_1[var3].field_236, this.field_arr_class3_1[var3].field_237) == 5) {
                this.arr_class_1[this.field_37].method_123(this.field_arr_class3_1[var3]);
            }
        }

        for (var3 = 0; var3 < this.arr_class_1.length; ++var3) {
            for (int var4 = 0; var4 < 15; ++var4) {
                if (!this.arr_class_1[var3].field_150[var4] && this.method_55(this.arr_class_1[var3].field_149[var4][0], this.arr_class_1[var3].field_149[var4][1]) == 5) {
                    this.arr_class_1[var3].field_150[var4] = true;
                }
            }
        }

    }

    // $FF: renamed from: d (int, int) void
    public final void method_52(int var1, int var2) {
        if (this.method_55(var1, var2) == 4) {
            switch (this.mapMask[var1][var2]) {
                case 19:
                    this.mapMask[var1][var2] = 16;
                    break;
                case 20:
                    this.mapMask[var1][var2] = 17;
                    break;
                case 21:
                    this.mapMask[var1][var2] = 18;
            }

            this.method_52(var1 - 1, var2);
            this.method_52(var1 + 1, var2);
            this.method_52(var1, var2 - 1);
            this.method_52(var1, var2 + 1);
        }
    }

    // $FF: renamed from: a (int, int, boolean) byte
    public final byte method_53(int var1, int var2, boolean var3) {
        return this.method_49(var1, var2) ? (this.arr_class_1[this.field_37].method_102(var1, var2) ? 6 : (this.arr_class_1[this.field_37].method_122().method_103(var1, var2, this.arr_class_1[this.field_37].field_167) ? 6 : (var3 && this.method_56(var1, var2) != null ? 6 : this.method_55(var1, var2)))) : 6;
    }

    // $FF: renamed from: a (int, int) byte
    public final byte method_54(int var1, int var2) {
        return this.method_53(var1, var2, true);
    }

    // $FF: renamed from: b (int, int) byte
    public final byte method_55(int var1, int var2) {
        int var3;
        return (byte) (!this.method_49(var1, var2) ? 6 : ((var3 = Math.abs(this.mapMask[var1][var2])) >= 16 && var3 <= 18 ? 5 : (var3 >= 19 && var3 <= 21 ? 4 : (var3 >= 22 && var3 <= 31 ? 0 : (var3 >= 32 && var3 <= 33 ? 0 : (var3 >= 34 && var3 <= 37 ? 7 : (var3 >= 38 && var3 <= 48 ? 1 : (var3 >= 49 && var3 <= 75 ? 3 : (var3 >= 76 && var3 <= 86 ? 2 : (var3 >= 87 && var3 <= 94 ? 9 : 6))))))))));
    }

    // $FF: renamed from: a (int, int) b
    public final class_3 method_56(int var1, int var2) {
        for (int var3 = 0; var3 < this.field_86; ++var3) {
            class_3 var4;
            if (!(var4 = this.field_arr_class3_1[var3]).field_242 && var1 == var4.field_236 && var2 == var4.field_237 && (!this.field_116 || !this.arr_class_1[this.field_37].field_172[var1][var2])) {
                return var4;
            }
        }

        return null;
    }

    // $FF: renamed from: j () void
    public final void method_57() {
        this.field_73 = true;

        int var1;
        for (var1 = this.mapCols - 1; var1 >= 0; --var1) {
            for (int var2 = this.mapRows - 1; var2 >= 0; --var2) {
                this.field_72[var1][var2] = -1;
            }
        }

        for (var1 = this.field_vector.size() - 1; var1 >= 0; --var1) {
            ((int[]) this.field_vector.elementAt(var1))[2] = 1;
        }

    }

    // $FF: renamed from: c (int, int) byte
    public final byte method_58(int var1, int var2) {
        return this.method_49(var1, var2) ? this.field_72[var1][var2] : -1;
    }

    // $FF: renamed from: b (java.lang.String) void
    private void loadMap(String paramStrLevel) {
        try {
            InputStream is = getClass().getResourceAsStream(paramStrLevel);
            DataInputStream dis = new DataInputStream(is);
            this.mapCols = dis.readByte();
            this.mapRows = dis.readByte();
            Graphics localGraphics = this.image.getGraphics();
            localGraphics.setColor(6973010);
            localGraphics.fillRect(0, 0, 400, 440);

            for (int i = 0; i < this.mapRows; ++i) {
                for (int j = 0; j < this.mapCols; ++j) {
                    this.mapMask[j][i] = dis.readByte();
                    if (this.mapMask[j][i] < 0) {
                        this.mapMask[j][i] = (byte) (this.mapMask[j][i] - field_138);
                    } else {
                        this.mapMask[j][i] = (byte) (this.mapMask[j][i] + field_138);
                    }

                    this.field_72[j][i] = -1;
                    byte var24;
                    switch (this.method_55(j, i)) {
                        case 0:
                            var24 = 97;
                            break;
                        case 1:
                            var24 = 103;
                            break;
                        case 2:
                            var24 = 96;
                            break;
                        case 3:
                            var24 = 104;
                            break;
                        case 4:
                            var24 = 95;
                            break;
                        case 5:
                            var24 = 105;
                            break;
                        case 6:
                        default:
                            var24 = 97;
                            break;
                        case 7:
                            var24 = 98;
                    }

                    localGraphics.drawImage(this.field_24[var24], j * 20, i * 20, 0);
                }
            }

            this.field_86 = dis.readByte();
            byte var25 = dis.readByte();
            byte var26 = dis.readByte();
            dis.readByte();
            this.arr_class_1[0].method_99(0, var25, (short) 0, this.field_101);
            if (this.isLevelm) {
                this.field_class_1.method_99(var25, var26, (short) 1, this.field_101);
                this.arr_class_1[1] = this.field_class_1;
            } else {
                this.field_class_2.method_136(var25, var26, (short) 1);
                this.arr_class_1[1] = this.field_class_2;
            }

            byte var9;
            byte var10;
            byte var11;
            byte var12;
            byte var13;
            int iterator;
            for (iterator = 0; iterator < var25; ++iterator) {
                var9 = dis.readByte();
                var10 = dis.readByte();
                var11 = dis.readByte();
                var12 = dis.readByte();
                var13 = dis.readByte();
                this.field_arr_class3_1[iterator].method_176(var10, var11, var9, var12, (byte) 0, var13);
                this.arr_class_1[0].method_121(this.field_arr_class3_1[iterator].field_236, this.field_arr_class3_1[iterator].field_237, this.field_arr_class3_1[iterator].field_252);
            }

            class_2 var21 = null;
            if (!this.isLevelm) {
                var21 = (class_2) this.arr_class_1[1];
            }

            while (iterator < var25 + var26) {
                var9 = dis.readByte();
                var10 = dis.readByte();
                var11 = dis.readByte();
                var12 = dis.readByte();
                var13 = dis.readByte();
                this.field_arr_class3_1[iterator].method_176(var10, var11, var9, var12, (byte) 1, var13);
                int var22 = iterator - this.arr_class_1[1].field_159;
                if (!this.isLevelm) {
                    var21.field_214[var22] = this.field_arr_class3_1[iterator];
                }

                byte var15 = dis.readByte();
                if (!this.isLevelm) {
                    var21.field_208[var22] = var15;
                }

                byte var17;
                byte var16;
                byte var19;
                switch (var15) {
                    case 1:
                    case 2:
                    default:
                        break;
                    case 3:
                    case 4:
                        var16 = dis.readByte();
                        var17 = dis.readByte();
                        var21.field_211[var22][0] = var16;
                        var21.field_211[var22][1] = var17;
                        break;
                    case 5:
                        byte var18 = dis.readByte();
                        var19 = dis.readByte();
                        var21.field_210[var22] = var18;
                        var21.field_209[var22] = var19;
                        var16 = dis.readByte();
                        var17 = dis.readByte();
                        var21.field_211[var22][0] = var16;
                        var21.field_211[var22][1] = var17;
                        break;
                    case 6:
                        byte var20 = dis.readByte();
                        var21.field_212[var22] = var20;
                        var19 = dis.readByte();
                        var21.field_209[var22] = var19;
                        var16 = dis.readByte();
                        var17 = dis.readByte();
                        var21.field_211[var22][0] = var16;
                        var21.field_211[var22][1] = var17;
                }

                this.arr_class_1[1].method_121(this.field_arr_class3_1[iterator].field_236, this.field_arr_class3_1[iterator].field_237, this.field_arr_class3_1[iterator].field_252);
                ++iterator;
            }

            this.field_87 = iterator;
            if (!this.isLevelm) {
                var21.method_138();
            }

            while (iterator < this.field_86) {
                var9 = dis.readByte();
                var10 = dis.readByte();
                var11 = dis.readByte();
                var12 = dis.readByte();
                var13 = dis.readByte();
                this.field_arr_class3_1[iterator].method_176(var10, var11, var9, var12, (byte) 2, var13);
                ++iterator;
            }

            byte var27 = dis.readByte();

            for (iterator = 0; iterator < var27; ++iterator) {
                this.arr_class_1[1].field_149[iterator][0] = dis.readByte();
                this.arr_class_1[1].field_149[iterator][1] = dis.readByte();
                this.arr_class_1[1].field_150[iterator] = false;
            }

            for (iterator = 0; iterator < 3; ++iterator) {
                if (dis.readByte() != 0) {
                    this.arr_class_1[0].field_176[iterator] = true;
                } else {
                    this.arr_class_1[0].field_176[iterator] = false;
                }
            }

            for (iterator = 0; iterator < 3; ++iterator) {
                if (dis.readByte() != 0) {
                    this.arr_class_1[1].field_176[iterator] = true;
                } else {
                    this.arr_class_1[1].field_176[iterator] = false;
                }
            }

            if (!this.isLevelm && (this.arr_class_1[1].field_176[1] || this.arr_class_1[1].field_176[2])) {
                var21.field_216 = dis.readByte();
                var21.field_217 = dis.readByte();
            }

            this.field_117 = dis.readByte();
            this.field_118 = this.field_119 = 0;
            label162:
            switch (this.field_117) {
                case 0:
                default:
                    break;
                case 1:
                    this.field_118 = dis.readByte();
                    this.field_119 = dis.readByte();
                    iterator = 0;

                    while (true) {
                        if (iterator >= this.field_119) {
                            break label162;
                        }

                        this.field_133[iterator] = dis.readByte();
                        ++iterator;
                    }
                case 2:
                    this.field_118 = dis.readByte();
                    this.field_119 = dis.readByte();

                    for (iterator = 0; iterator < this.field_119; ++iterator) {
                        this.field_133[iterator] = dis.readByte();
                    }

                    this.field_121 = dis.readByte();
                    this.field_122 = dis.readByte();
                    this.field_123 = dis.readByte();
                    this.field_124 = dis.readByte();
                    break;
                case 3:
                    this.field_121 = dis.readByte();
                    this.field_122 = dis.readByte();
                    this.field_123 = dis.readByte();
                    this.field_124 = dis.readByte();
            }

            for (iterator = 0; iterator < this.field_119; ++iterator) {
                this.field_arr_class3_2[iterator] = this.field_arr_class3_1[this.method_60(this.field_133[iterator])];
            }

            this.field_125 = dis.readByte();
            this.field_126 = this.field_127 = 0;
            label141:
            switch (this.field_125) {
                case 0:
                default:
                    break;
                case 1:
                    this.field_126 = dis.readByte();
                    this.field_127 = dis.readByte();
                    iterator = 0;

                    while (true) {
                        if (iterator >= this.field_127) {
                            break label141;
                        }

                        this.field_133[iterator] = dis.readByte();
                        ++iterator;
                    }
                case 2:
                    this.field_126 = dis.readByte();
                    this.field_127 = dis.readByte();

                    for (iterator = 0; iterator < this.field_127; ++iterator) {
                        this.field_133[iterator] = dis.readByte();
                    }

                    this.field_129 = dis.readByte();
                    this.field_130 = dis.readByte();
                    this.field_131 = dis.readByte();
                    this.field_132 = dis.readByte();
            }

            for (iterator = 0; iterator < this.field_127; ++iterator) {
                this.field_arr_class3_3[iterator] = this.field_arr_class3_1[this.method_60(this.field_133[iterator])];
            }

            this.field_91 = dis.readByte() + 1;
            this.field_92[0][0] = -1;
            this.field_92[0][1] = 1;
            this.field_92[0][2] = 127;

            for (iterator = 1; iterator < this.field_91; ++iterator) {
                this.field_92[iterator][0] = dis.readByte();
                this.field_92[iterator][1] = dis.readByte();
                this.field_92[iterator][2] = dis.readByte();
            }

            this.field_93 = 1;
            this.field_95 = -1;
            is.close();
        } catch (Exception var23) {
            ;
        }
    }

    // $FF: renamed from: r (int) int
    public final int method_60(int var1) {
        for (int var2 = this.field_86 - 1; var2 >= 0; --var2) {
            if (this.field_arr_class3_1[var2].field_249 == var1) {
                return var2;
            }
        }

        return -1;
    }

    // $FF: renamed from: b (int, int) boolean
    public final boolean method_61(int var1, int var2) {
        this.field_89 = -1;
        if (!this.field_73 && this.field_72[var1][var2] != -1) {
            ++this.field_89;
            this.field_88[this.field_89][0] = var1;
            this.field_88[this.field_89][1] = var2;
            return this.method_62(this.field_88[this.field_89]);
        } else {
            return false;
        }
    }

    // $FF: renamed from: a (int[]) boolean
    public final boolean method_62(int[] var1) {
        byte var2 = -1;
        int var3 = 0;
        byte var4 = this.field_72[var1[0]][var1[1]];

        for (int var5 = class_3.field_229.length - 2; var5 >= 0; var5 -= 2) {
            int var6 = var1[0] + class_3.field_229[var5][0];
            int var7 = var1[1] + class_3.field_229[var5][1];
            if (this.method_49(var6, var7) && this.field_72[var6][var7] > var2 && this.field_72[var6][var7] > var4) {
                var2 = this.field_72[var6][var7];
                var3 = var5;
            }
        }

        if (var2 != -1) {
            ++this.field_89;
            this.field_88[this.field_89][0] = var1[0] + class_3.field_229[var3][0];
            this.field_88[this.field_89][1] = var1[1] + class_3.field_229[var3][1];
            return this.method_62(this.field_88[this.field_89]);
        } else {
            return false;
        }
    }

    // $FF: renamed from: a (int, boolean) void
    public final void method_63(int var1, boolean var2) {
        this.method_64(this.field_arr_class3_1[var1], var2);
    }

    // $FF: renamed from: a (b, boolean) void
    public final void method_64(class_3 var1, boolean var2) {
        if (var2 && this.field_37 == this.field_38) {
            boolean var3 = false;
            if (var1.method_171()) {
                var3 = true;
                this.field_41.method_192(38, false);
            } else {
                this.field_41.method_192(38, true);
            }

            if (var1.method_166()) {
                var3 = true;
                this.field_41.method_192(37, false);
            } else {
                this.field_41.method_192(37, true);
            }

            if (var1.method_173()) {
                var3 = true;
                this.field_41.method_192(35, false);
            } else {
                this.field_41.method_192(35, true);
            }

            if (var1.method_169()) {
                var3 = true;
                this.field_41.method_192(36, false);
            } else {
                this.field_41.method_192(36, true);
            }

            if (var3) {
                this.field_class_3 = var1;
                this.field_41.method_198();
                this.method_16(this.field_41);
                this.method_14(20);
            }
        }

        int var14 = this.method_41(var1.field_234);
        int var4 = this.method_42(var1.field_235);
        int var5 = var1.field_251 / 10;
        int var6;
        int var7;
        if (!var2) {
            this.field_73 = true;

            for (var6 = var14 - var5; var6 <= var14 + var5; ++var6) {
                for (var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
                    this.method_66(var6, var7, (byte) -1);
                }
            }
        } else {
            for (var6 = this.field_vector.size() - 1; var6 >= 0; --var6) {
                ((int[]) this.field_vector.elementAt(var6))[2] = 1;
            }

            int[] var15;
            (var15 = method_65(this.field_vector, 3))[0] = var14;
            var15[1] = var4;
            this.field_73 = false;
            this.field_72[var14][var4] = (byte) var1.field_248;
            this.field_116 = true;

            do {
                var7 = 0;

                for (int var8 = this.field_vector.size() - 1; var8 >= 0; --var8) {
                    int[] var9;
                    if ((var9 = (int[]) this.field_vector.elementAt(var8))[2] != 1) {
                        boolean var10 = false;

                        for (int var11 = class_3.field_229.length - 2; var11 >= 0; var11 -= 2) {
                            var14 = var9[0] + class_3.field_229[var11][0];
                            var4 = var9[1] + class_3.field_229[var11][1];
                            if (this.method_49(var14, var4)) {
                                int var12 = this.field_72[var9[0]][var9[1]] - this.method_69(var1, var14, var4);
                                if ((this.field_72[var14][var4] == -1 || this.field_72[var14][var4] < var12) && var12 >= 0) {
                                    ++var7;
                                    var10 = true;
                                    this.field_72[var14][var4] = (byte) var12;
                                    int[] var13;
                                    (var13 = method_65(this.field_vector, 3))[0] = var14;
                                    var13[1] = var4;
                                }
                            }
                        }

                        if (!var10) {
                            var9[2] = 1;
                        }
                    }
                }
            } while (var7 != 0);

            this.field_116 = false;
        }

    }

    // $FF: renamed from: a (java.util.Vector, int) int[]
    public static final int[] method_65(Vector var0, int var1) {
        int[] var2 = null;

        for (int var3 = var0.size() - 1; var3 >= 0; --var3) {
            int[] var4;
            if ((var4 = (int[]) var0.elementAt(var3))[2] == 1) {
                var2 = var4;
                break;
            }
        }

        if (var2 == null) {
            var2 = new int[var1];
            var0.addElement(var2);
        }

        var2[2] = 0;
        return var2;
    }

    // $FF: renamed from: a (int, int, byte) void
    public final void method_66(int var1, int var2, byte var3) {
        if (this.method_49(var1, var2)) {
            this.field_72[var1][var2] = var3;
        }

    }

    // $FF: renamed from: b (int, int) int
    public final int method_67(int var1, int var2) {
        return this.method_68(var1, var2, true);
    }

    // $FF: renamed from: a (int, int, boolean) int
    public final int method_68(int var1, int var2, boolean var3) {
        short var4 = 10;
        switch (this.method_53(var1, var2, var3)) {
            case 0:
                var4 = 10;
                break;
            case 1:
                var4 = 0;
                break;
            case 2:
                var4 = 20;
                break;
            case 3:
            case 5:
                var4 = 100;
                break;
            case 4:
                var4 = 5;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                var4 = 1000;
        }

        return var4;
    }

    // $FF: renamed from: a (b, int, int) int
    public final int method_69(class_3 var1, int var2, int var3) {
        return this.method_70(var1, this.method_67(var2, var3), var2, var3);
    }

    // $FF: renamed from: a (b, int, int, int) int
    public final int method_70(class_3 var1, int var2, int var3, int var4) {
        int var5;
        return (var5 = 10 + var2 - var1.field_256) < 10 ? 10 : var5;
    }

    // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
    private void method_71(Graphics var1) {
        this.method_74(var1, 0, 220, 240, 90, 4);
        if (this.field_92[this.field_93][1] == 1) {
            var1.drawImage(this.field_24[125], 10, 220, 36);
        } else {
            var1.drawImage(this.field_24[124], 230, 220, 40);
        }
    }

    // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
    public final void method_72(Graphics localGraphics, int var2, int var3, int var4, int var5) {
        int var6 = 10;

        int var7;
        for (var7 = var4 - 10; var6 < var7; var6 += 50) {
            localGraphics.drawImage(this.field_24[13], var2 + var6, var3, 20);
        }

        localGraphics.drawImage(this.field_24[10], var2, var3, 20);
        localGraphics.drawImage(this.field_24[12], var2 + var4, var3, 24);
        var6 = 9;

        for (var7 = var5 - 19; var6 < var7; var6 += 50) {
            localGraphics.drawImage(this.field_24[8], var2, var3 + var6, 20);
        }

        var6 = 9;

        for (var7 = var5 - 19; var6 < var7; var6 += 50) {
            localGraphics.drawImage(this.field_24[8], var2 + var4, var3 + var6, 24);
        }

        localGraphics.drawImage(this.field_24[226], 0, 320, 36);
        localGraphics.setClip(8, 9, 224, 292);
    }

    // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int) void
    private void method_73(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setClip(0, 0, 240, 320);
        var1.drawImage(this.field_24[10], var2, var3, 20);
        var1.drawImage(this.field_24[9], var2, var3 + var5, 36);
        var1.drawImage(this.field_24[12], var2 + var4, var3, 24);
        var1.drawImage(this.field_24[11], var2 + var4, var3 + var5, 40);
        var1.setClip(var2 + 10, var3 + 0, var4 - 20, 9);
        int var6 = 10;

        int var7;
        for (var7 = var4 - 10; var6 < var7; var6 += 50) {
            var1.drawImage(this.field_24[13], var2 + var6, var3, 20);
        }

        var1.setClip(var2 + 10, var3 + var5 - 9, var4 - 20, 9);
        var6 = 10;

        for (var7 = var4 - 10; var6 < var7; var6 += 50) {
            var1.drawImage(this.field_24[6], var2 + var6, var3 + var5, 36);
        }

        var1.setClip(var2 + 0, var3 + 9, 8, var5 - 18);
        var6 = 9;

        for (var7 = var5 - 9; var6 < var7; var6 += 50) {
            var1.drawImage(this.field_24[8], var2, var3 + var6, 20);
        }

        var1.setClip(var2 + var4 - 8, var3 + 9, 8, var5 - 18);
        var6 = 9;

        for (var7 = var5 - 9; var6 < var7; var6 += 50) {
            var1.drawImage(this.field_24[8], var2 + var4, var3 + var6, 24);
        }

        var1.setClip(var2 + 8, var3 + 9, var4 - 16, var5 - 18);
        var6 = var2 + 8;

        for (var7 = var2 + var4 - 8; var6 < var7; var6 += 22) {
            int var8 = var3 + 9;

            for (int var9 = var3 + var5 - 9; var8 < var9; var8 += 22) {
                var1.drawImage(this.field_24[7], var6, var8, 20);
            }
        }

    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
    public final void method_74(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        this.method_73(var1, var2, var3, var4, var5);
        if (var6 == 1) {
            this.field_class5.method_206(var1, var2 + var4 / 2, var3 + 20, 1);
        } else {
            this.field_class5.method_206(var1, var2 + 10, var3 + 20, 4);
        }

        var1.setClip(0, 0, 240, 320);
        if (this.field_class5.something > 0) {
            var1.drawImage(this.field_24[5], var2 + var4 - 10, var3 + 10, 24);
        }

        if (this.field_class5.something < this.field_class5.maxSomething) {
            var1.drawImage(this.field_24[4], var2 + var4 - 10, var3 + var5 - 10, 40);
        }

    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
    public final void method_75(Graphics var1, int var2, int var3, int var4) {
        int var5 = this.field_class5.method_204(var2);
        int var6 = this.field_class5.field_281;
        this.method_73(var1, var3 - var5 / 2 - 12, var4 - var6 / 2 - 12, var5 + 24, var6 + 24);
        this.field_class5.method_202(var1, var2, var3 - var5 / 2, var4 - var6 / 2, 4);
    }

    // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int) void
    public final void method_76(Graphics var1, int var2, int var3) {
        int var4 = this.field_class5.field_285;
        int var5 = this.field_class5.method_205();
        this.method_73(var1, var2 - var4 / 2 - 10, var3 - var5 / 2 - 12, var4 + 20, var5 + 24);
        this.field_class5.method_210(var1, var2, var3 - var5 / 2, 0, this.field_class5.field_286, 1);
    }

    // $FF: renamed from: k () void
    public final void method_77() {
        int var1 = this.method_41(this.field_75);
        int var2 = this.method_42(this.field_76);
        int var3 = this.arr_class_1[this.field_37].field_161;
        this.field_135 = -1;
        this.field_97 = 57;

        int var4;
        for (var4 = 0; var4 < this.field_87; ++var4) {
            if (this.field_135 < 0 && !this.field_arr_class3_1[var4].field_242 && this.field_arr_class3_1[var4].field_236 == var1 && this.field_arr_class3_1[var4].field_237 == var2 && !this.arr_class_1[this.field_38].field_172[var1][var2]) {
                this.field_135 = var4;
                break;
            }
        }

        if (var3 >= 0) {
            if (this.field_135 >= 0) {
                if (this.field_arr_class3_1[this.field_135].field_263 != this.field_37) {
                    if (this.field_arr_class3_1[var3].method_162(this.field_arr_class3_1[this.field_135])) {
                        this.field_77 = 2;
                    } else {
                        this.field_77 = 3;
                    }
                } else {
                    this.field_77 = 1;
                }
            } else if (this.method_58(var1, var2) == -1) {
                this.field_77 = 3;
            }
        } else {
            this.field_77 = 1;
        }

        if (this.arr_class_1[this.field_37].method_119(var3) < 0) {
            this.field_97 = 64;
        }

        this.field_136 = this.method_78(this.field_136);
        this.field_137 = 0;
        var4 = this.field_136;
        if (this.field_136 >= 0) {
            do {
                ++this.field_137;
                var4 = this.method_78(var4 - 1);
            } while (this.field_136 != var4);

            this.field_97 = 58;
        }

    }

    // $FF: renamed from: s (int) int
    public final int method_78(int var1) {
        int var2;
        if ((var2 = this.arr_class_1[this.field_37].field_161) < 0) {
            return -1;
        } else {
            int var3 = 0;

            do {
                if (var1 < 0) {
                    var1 = this.field_87 - 1;
                }

                if (this.field_arr_class3_1[var2].field_263 != this.field_arr_class3_1[var1].field_263 && !this.field_arr_class3_1[var1].field_242 && !this.arr_class_1[this.field_38].field_172[this.field_arr_class3_1[var1].field_236][this.field_arr_class3_1[var1].field_237] && this.field_arr_class3_1[var2].method_162(this.field_arr_class3_1[var1])) {
                    return var1;
                }

                --var1;
                ++var3;
            } while (var3 < this.field_87);

            return -1;
        }
    }

    // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int) void
    public final void method_79(Graphics localGraphics, int var2, int var3, int var4) {
        boolean var6 = false;
        localGraphics.setColor(1052688);
        localGraphics.fillRect(0, 0, 240, 320);
        localGraphics.drawImage(this.image, var3, var4, 0);
        this.method_72(localGraphics, 0, 0, 240, 320);

        int var7;
        for (var7 = 0; var7 <= 1; ++var7) {
            if (this.arr_class_1[var7].field_178 >= 0 && (var7 == this.field_38 || !this.arr_class_1[this.field_38].field_172[this.arr_class_1[var7].field_179][this.arr_class_1[var7].field_180])) {
                localGraphics.drawImage(this.field_24[100 + this.arr_class_1[var7].field_187 + var7], var3 + var2 * this.arr_class_1[var7].field_179, var4 + var2 * this.arr_class_1[var7].field_180, 0);
                if (var7 == this.field_38) {
                    if (var7 == 0) {
                        localGraphics.setColor(255);
                    } else {
                        localGraphics.setColor(16711680);
                    }

                    int var8 = var3 + var2 * this.method_41(this.arr_class_1[this.field_38].field_183);
                    int var9 = var4 + var2 * this.method_42(this.arr_class_1[this.field_38].field_184);
                    localGraphics.drawLine(var8, var9, var8 + var2, var9 + var2);
                    localGraphics.drawLine(var8 + var2, var9, var8, var9 + var2);
                }
            }
        }

        for (var7 = 0; var7 < this.field_86; ++var7) {
            if (!this.arr_class_1[this.field_38].field_172[this.field_arr_class3_1[var7].field_236][this.field_arr_class3_1[var7].field_237] && !this.field_arr_class3_1[var7].field_242) {
                if (this.field_arr_class3_1[var7].field_263 == 0) {
                    localGraphics.setColor(255);
                } else if (this.field_arr_class3_1[var7].field_263 == 1) {
                    localGraphics.setColor(16711680);
                } else {
                    localGraphics.setColor(12303291);
                }

                if (var7 == this.arr_class_1[this.field_37].field_161) {
                    localGraphics.fillArc(var3 + var2 * this.field_arr_class3_1[var7].field_236 - this.field_82, var4 + var2 * this.field_arr_class3_1[var7].field_237 - this.field_82, var2 - 1 + this.field_82 + this.field_82, var2 - 1 + this.field_82 + this.field_82, 0, 360);
                } else {
                    localGraphics.fillArc(var3 + var2 * this.field_arr_class3_1[var7].field_236, var4 + var2 * this.field_arr_class3_1[var7].field_237, var2 - 1, var2 - 1, 0, 360);
                }
            }
        }

    }

    // $FF: renamed from: l () void
    public final void method_80() {
        if (this.field_5 > 0) {
            this.field_3 = 224 - 20 * this.mapCols >> 1;
        } else {
            this.field_3 = this.field_59 * this.field_5 / this.field_61;
        }

        if (this.field_6 > 0) {
            this.field_4 = 292 - 20 * this.mapRows >> 1;
        } else {
            this.field_4 = this.field_60 * this.field_6 / this.field_62;
        }
    }

   // $FF: renamed from: c (java.lang.String) void
    // levelTypeStr - имя локации (мультиплеер или синглплеер)
    public final void saveNewGame(String levelTypeStr) {
        try {
            RecordStore store;
            RecordEnumeration recordEnum = (store = RecordStore.openRecordStore(levelTypeStr, true)).enumerateRecords((RecordFilter) null, (RecordComparator) null, false);

            while (recordEnum.hasNextElement()) {
                store.deleteRecord(recordEnum.nextRecordId());
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream bos;
            (bos = new DataOutputStream(baos)).writeInt(this.field_49);
            bos.writeInt(this.field_93);
            bos.writeInt(this.field_37);
            bos.writeInt(this.field_106);

            for (int i = 0; i < this.mapRows; ++i) {
                for (int j = 0; j < this.mapCols; ++j) {
                    byte var6 = this.method_55(j, i);
                    if (var6 == 4 || var6 == 5) {
                        bos.writeInt(j);
                        bos.writeInt(i);
                        bos.writeByte(this.mapMask[j][i]);
                    }
                }
            }

            bos.writeInt(-666);

            for (int i = 0; i < this.field_86; ++i) {
                bos.writeInt(this.field_arr_class3_1[i].field_249);
                bos.writeInt(this.field_arr_class3_1[i].field_236);
                bos.writeInt(this.field_arr_class3_1[i].field_237);
                bos.writeInt(this.field_arr_class3_1[i].field_246);
                bos.writeInt(this.field_arr_class3_1[i].field_241);
                bos.writeInt(this.field_arr_class3_1[i].field_247);
                bos.writeInt(this.field_arr_class3_1[i].field_259);
                bos.writeInt(this.field_arr_class3_1[i].field_248);
                bos.writeBoolean(this.field_arr_class3_1[i].field_242);
                bos.writeByte(this.field_arr_class3_1[i].field_263);
                bos.writeBoolean(this.field_arr_class3_1[i].field_232);
            }

            for (int i = 0; i < 2; ++i) {
                bos.writeInt(this.arr_class_1[i].field_159);
                bos.writeInt(this.arr_class_1[i].field_160);
                bos.writeInt(this.arr_class_1[i].field_161);
                bos.writeBoolean(this.arr_class_1[i].field_162);

                for (int j = 0; j < this.mapCols; ++j) {
                    for (int k = 0; k < this.mapRows; ++k) {
                        bos.writeBoolean(this.arr_class_1[i].field_172[j][k]);
                    }
                }

                for (int j = 0; j < 15; ++j) {
                    bos.writeInt(this.arr_class_1[i].field_149[j][0]);
                    bos.writeInt(this.arr_class_1[i].field_149[j][1]);
                    bos.writeBoolean(this.arr_class_1[i].field_150[j]);
                    bos.writeBoolean(this.arr_class_1[i].field_151[j]);
                }

                bos.writeInt(this.arr_class_1[i].field_177);
                bos.writeInt(this.arr_class_1[i].field_178);
                bos.writeInt(this.arr_class_1[i].field_179);
                bos.writeInt(this.arr_class_1[i].field_180);
                bos.writeInt(this.arr_class_1[i].field_181);
                bos.writeInt(this.arr_class_1[i].field_182);
                bos.writeInt(this.arr_class_1[i].field_183);
                bos.writeInt(this.arr_class_1[i].field_184);
                bos.writeInt(this.arr_class_1[i].field_187);
                bos.writeInt(this.arr_class_1[i].field_197);
                bos.writeInt(this.arr_class_1[i].field_171);
                bos.writeInt(this.arr_class_1[i].field_168);
            }

            if (!this.isLevelm) {
                for (int i = 0; i < this.arr_class_1[0].field_157.length; ++i) {
                    bos.writeInt(this.arr_class_1[0].field_157[i]);
                    bos.writeByte(this.arr_class_1[0].field_158[i]);
                }

                class_2 var11;
                (var11 = (class_2) this.arr_class_1[1]).method_157();

                for (int j = 0; j < var11.field_160; ++j) {
                    bos.writeInt(var11.field_208[j]);
                    bos.writeInt(var11.field_210[j]);
                    bos.writeInt(var11.field_211[j][0]);
                    bos.writeInt(var11.field_211[j][1]);
                    bos.writeInt(var11.field_212[j]);
                }
            } else if (this.field_9 < 0) {
                this.field_9 = 100;
            }

            bos.writeInt(this.field_75);
            bos.writeInt(this.field_76);
            store.addRecord(baos.toByteArray(), 0, baos.toByteArray().length);
            store.closeRecordStore();
        } catch (Exception var10) {
            this.field_9 = -1;
        }
    }

    // $FF: renamed from: d (java.lang.String) void
    public final void method_82(String var1) {
        try {
            RecordStore var2;
            RecordEnumeration var3 = (var2 = RecordStore.openRecordStore(var1, true)).enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            ByteArrayInputStream var4 = new ByteArrayInputStream(var3.nextRecord());
            DataInputStream var5 = new DataInputStream(var4);
            this.field_49 = var5.readInt();
            this.field_93 = var5.readInt();
            this.field_37 = var5.readInt();
            this.field_106 = var5.readInt();
            if (this.isLevelm) {
                this.field_38 = this.field_37;
            } else {
                this.field_38 = 0;
            }

            int var6;
            int var7;
            while ((var6 = var5.readInt()) != -666) {
                var7 = var5.readInt();
                this.mapMask[var6][var7] = var5.readByte();
            }

            boolean var9 = false;
            class_3 var10 = null;

            for (var7 = 0; var7 < this.field_86; ++var7) {
                int var14 = var5.readInt();
                if ((var6 = this.method_60(var14)) != var7) {
                    var10 = this.field_arr_class3_1[var7];
                    this.field_arr_class3_1[var7] = this.field_arr_class3_1[var6];
                    this.field_arr_class3_1[var6] = var10;
                    var6 = var7;
                }

                this.field_arr_class3_1[var6].field_236 = var5.readInt();
                this.field_arr_class3_1[var6].field_237 = var5.readInt();
                this.field_arr_class3_1[var6].field_234 = this.method_39(this.field_arr_class3_1[var6].field_236);
                this.field_arr_class3_1[var6].field_235 = this.method_40(this.field_arr_class3_1[var6].field_237);
                this.field_arr_class3_1[var6].field_246 = var5.readInt();
                this.field_arr_class3_1[var6].method_177(this.field_arr_class3_1[var6].field_246);
                this.field_arr_class3_1[var6].field_241 = var5.readInt();
                this.field_arr_class3_1[var6].field_247 = var5.readInt();
                this.field_arr_class3_1[var6].field_259 = var5.readInt();
                this.field_arr_class3_1[var6].field_248 = var5.readInt();
                this.field_arr_class3_1[var6].field_242 = var5.readBoolean();
                this.field_arr_class3_1[var6].field_263 = var5.readByte();
                this.field_arr_class3_1[var6].field_232 = var5.readBoolean();
            }

            this.field_87 = 0;

            int var11;
            int var12;
            for (var6 = 0; var6 < 2; ++var6) {
                this.arr_class_1[var6].field_159 = var5.readInt();
                this.arr_class_1[var6].field_160 = var5.readInt();
                this.field_87 += this.arr_class_1[var6].field_160;
                this.arr_class_1[var6].field_161 = var5.readInt();
                this.arr_class_1[var6].field_162 = var5.readBoolean();

                for (var11 = 0; var11 < this.mapCols; ++var11) {
                    for (var12 = 0; var12 < this.mapRows; ++var12) {
                        this.arr_class_1[var6].field_172[var11][var12] = var5.readBoolean();
                    }
                }

                for (var7 = 0; var7 < 15; ++var7) {
                    this.arr_class_1[var6].field_149[var7][0] = var5.readInt();
                    this.arr_class_1[var6].field_149[var7][1] = var5.readInt();
                    this.arr_class_1[var6].field_150[var7] = var5.readBoolean();
                    this.arr_class_1[var6].field_151[var7] = var5.readBoolean();
                }

                this.arr_class_1[var6].field_177 = var5.readInt();
                this.arr_class_1[var6].field_178 = var5.readInt();
                this.arr_class_1[var6].field_179 = var5.readInt();
                this.arr_class_1[var6].field_180 = var5.readInt();
                this.arr_class_1[var6].field_181 = var5.readInt();
                this.arr_class_1[var6].field_182 = var5.readInt();
                this.arr_class_1[var6].field_183 = var5.readInt();
                this.arr_class_1[var6].field_184 = var5.readInt();
                this.arr_class_1[var6].field_187 = var5.readInt();
                this.arr_class_1[var6].field_197 = var5.readInt();
                this.arr_class_1[var6].field_171 = var5.readInt();
                this.arr_class_1[var6].field_168 = var5.readInt();
            }

            if (!this.isLevelm) {
                for (var11 = 0; var11 < this.arr_class_1[0].field_157.length; ++var11) {
                    this.arr_class_1[0].field_157[var11] = var5.readInt();
                    this.arr_class_1[0].field_158[var11] = var5.readByte();
                }

                class_2 var15 = (class_2) this.arr_class_1[1];

                for (var12 = 0; var12 < var15.field_160; ++var12) {
                    var15.field_208[var12] = var5.readInt();
                    var15.field_210[var12] = var5.readInt();
                    var15.field_211[var12][0] = var5.readInt();
                    var15.field_211[var12][1] = var5.readInt();
                    var15.field_212[var12] = var5.readInt();
                }
            }

            this.field_75 = var5.readInt();
            this.field_76 = var5.readInt();
            this.method_57();
            if (this.arr_class_1[0].field_161 >= 0) {
                this.method_64(this.field_arr_class3_1[this.arr_class_1[0].field_161], true);
            }

            this.method_30(this.field_75, this.field_76);
            var2.closeRecordStore();
        } catch (Exception var13) {
            ;
        }
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
    public final void method_83(Graphics var1, int var2) {
        var1.setClip(0, 0, 240, 320);
        switch (var2) {
            case 56:
                return;
            case 57:
            case 58:
                var1.setColor(16777215);
                var1.drawImage(this.field_24[15], 238, 318, 40);
                return;
            default:
                var1.drawImage(this.field_24[1], 240 - this.field_class5.method_204(var2) - 13, 320 + this.field_140, 36);
                this.field_class5.method_202(var1, var2, 239, 317 - this.field_class5.field_281 + this.field_140, 8);
        }
    }

    // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int) void
    public final void method_84(Graphics var1, int var2) {
        var1.setClip(0, 0, 240, 320);
        switch (var2) {
            case 56:
                return;
            case 57:
            case 58:
                var1.setColor(16777215);
                var1.drawImage(this.field_24[15], 2, 318, 36);
                return;
            case 59:
            case 60:
            default:
                var1.drawImage(this.field_24[1], this.field_class5.method_204(var2) + 13, 320 + this.field_139, 40);
                this.field_class5.method_202(var1, var2, 1, 317 - this.field_class5.field_281 + this.field_139, 4);
                return;
            case 61:
                var1.drawImage(this.field_24[4], 2, 318, 36);
        }
    }

    // $FF: renamed from: m () void
    public final void method_85() {
        ++this.field_11;
        ++this.field_12;
        if (this.field_11 <= 10) {
            this.method_14(33);
        } else {
            this.field_7 = true;
            this.method_14(44);
        }
    }

    // $FF: renamed from: b (int) void
    public final void method_86(int var1) {
        this.field_96 = var1;
        this.field_139 = 20;
    }

    // $FF: renamed from: c (int) void
    public final void method_87(int var1) {
        this.field_97 = var1;
        this.field_140 = 20;
    }

    // $FF: renamed from: a (java.lang.String, java.lang.String) javax.microedition.media.Player
    public final Player getMusicPlayer(String var1, String var2) {
        Player player = null;

        try {
            (player = Manager.createPlayer(getClass().getResourceAsStream(var1), var2)).realize();
            player.prefetch();
            player.setLoopCount(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return player;
    }

    // $FF: renamed from: d (int) void
    public final void method_89(int var1) {
        if (this.field_30 && !this.field_143) {
            try {
                this.field_soundPlayers[this.field_141].stop();
            } catch (Exception var5) {
                ;
            }

            this.field_141 = var1;

            try {
                this.field_soundPlayers[this.field_141].setMediaTime(0L);
                this.field_soundPlayers[this.field_141].setLoopCount(1);
            } catch (Exception var4) {
                ;
            }

            try {
                this.field_soundPlayers[this.field_141].start();
            } catch (Exception var3) {
                ;
            }
        }

        this.field_143 = true;
    }

    // $FF: renamed from: e (int) void
    public final void method_90(int var1) {
        try {
            this.field_soundPlayers[var1].stop();
        } catch (Exception var3) {
            ;
        }
    }

    // $FF: renamed from: n () void
    public final void method_91() {
        if (this.isLevelm) {
            this.saveNewGame("MultiPlLevel");
        } else {
            this.field_9 = this.field_11;
            this.saveNewGame("CompanyLevel");
        }

        this.writeRecordStore();
    }

    // $FF: renamed from: t (int) int
    public final int method_92(int var1) {
        class_4 var10001;
        switch (var1) {
            case 0:
                for (; timeMillis < this.field_16; timeMillis = System.currentTimeMillis()) {
                    if (this.field_26 >= field_138) {
                        var1 = 1;
                        this.field_29 += 400;
                        return var1;
                    }

                    this.field_29 = (int) ((long) this.field_29 + this.field_22[this.field_26][1]);

                    try {
                        this.method_9(this.field_26, 1);
                    } catch (Exception var4) {
                        ;
                    }
                }

                return var1;
            case 1:
                this.readRecordStore();
                this.field_7 = true;

                try {
                    Image var2 = Image.createImage("/font_image.png");
                    class_5 var5 = new class_5("/text.res", var2, 30);
                    this.field_class5 = var5;
                    this.field_class5.method_201(0, 230);
                } catch (Exception var3) {
                    ;
                }

                var1 = 2;
                this.field_29 += 400;
                break;
            case 2:
                var10001 = new class_4(7, 27);
                this.field_39 = var10001;
                this.field_39.method_192(27, true);
                if (this.field_9 < 0) {
                    this.field_39.method_192(29, true);
                }

                this.field_39.method_193(28);
                this.method_16(this.field_39);
                var1 = 3;
                this.field_29 += 400;
                break;
            case 3:
                var10001 = new class_4(5, 34);
                this.field_41 = var10001;
                var10001 = new class_4(4, 39);
                this.field_42 = var10001;
                this.method_16(this.field_42);
                var10001 = new class_4(4, 43);
                this.field_43 = var10001;
                var10001 = new class_4(10, 220);
                this.field_46 = var10001;
                var10001 = new class_4(5, 51);
                this.field_44 = var10001;
                this.field_44.method_192(53, !this.field_31);
                this.field_44.method_192(54, this.field_31);
                this.field_44.method_192(51, !this.field_30);
                this.field_44.method_192(52, this.field_30);
                this.method_16(this.field_44);
                this.field_44.field_269 = this.field_44.field_265 - 1;
                var10001 = new class_4(4, 47);
                this.field_45 = var10001;
                this.method_16(this.field_45);
                var10001 = new class_4(12, 15);
                this.field_40 = var10001;
                this.method_16(this.field_40);
                var1 = 4;
                this.field_29 += 400;
                break;
            case 4:
                if (this.field_141 < 12) {
                    this.field_soundPlayers[this.field_141] = this.getMusicPlayer("/" + this.field_141 + (this.field_141 < 3 ? ".mid" : ".wav"), this.field_141 < 3 ? "audio/midi" : "audio/x-wav");
                    ++this.field_141;
                    this.field_29 += 400;
                } else {
                    this.field_141 = 0;
                    this.method_14(3);
                }
        }

        return var1;
    }

    // $FF: renamed from: d (javax.microedition.lcdui.Graphics, int, int, int, int) void
    private void method_93(Graphics var1, int var2, int var3, int var4, int var5) {
        this.method_73(var1, var2, var3, var4, var5);
        if (!this.isLevelm) {
            this.field_class5.method_202(var1, 220 + this.field_11 - 1, 120, var3 + this.field_class5.field_281, 1);
        }

        this.field_class5.method_206(var1, var2 + 10, var3 + 15 + this.field_class5.field_281 + 4, 4);
        var1.setClip(0, 0, 240, 320);
        if (!this.isLevelm) {
            var1.drawLine(20, var3 + this.field_class5.field_281 + this.field_class5.field_281 + 1 + 2, 220, var3 + this.field_class5.field_281 + this.field_class5.field_281 + 1 + 2);
        }

        if (this.field_class5.something > 0) {
            var1.drawImage(this.field_24[5], var2 + var4 - 10, var3 + 10 + 4, 24);
        }

        if (this.field_class5.something < this.field_class5.maxSomething) {
            var1.drawImage(this.field_24[4], var2 + var4 - 10, var3 + var5 - 10, 40);
        }

    }

    // $FF: renamed from: <clinit> () void
    static {
        random = new Random(System.currentTimeMillis());
        field_138 = 16;
    }
}
