package defpackage;

// $FF: renamed from: c
public final class class_4 {

   // $FF: renamed from: a int
   public int field_265;
   // $FF: renamed from: b int
   public int field_266;
   // $FF: renamed from: c int
   public int field_267;
   // $FF: renamed from: a boolean[]
   public boolean[] field_268;
   // $FF: renamed from: d int
   public int field_269;
   // $FF: renamed from: e int
   public int field_270;
   // $FF: renamed from: f int
   public int field_271;
   // $FF: renamed from: g int
   public int field_272;


   // $FF: renamed from: <init> (int, int) void
   // method_191
   public class_4(int var1, int var2) {
      this.field_265 = var1;
      this.field_272 = var2;
      this.field_269 = 0;
      this.field_266 = 0;
      this.field_267 = this.field_265;
      this.field_268 = new boolean[this.field_265];

      for(int var3 = 0; var3 < this.field_265; ++var3) {
         this.field_268[var3] = false;
      }

   }

   // $FF: renamed from: a (int, boolean) void
   public final void method_192(int var1, boolean var2) {
      this.field_268[var1 - this.field_272] = var2;
   }

   // $FF: renamed from: a (int) void
   public final void method_193(int var1) {
      this.field_269 = var1 - this.field_272;
   }

   // $FF: renamed from: a (int) int
   public final int method_194(int var1) {
      int var2 = 0;
      int var3 = 0;

      while(var3 != var1) {
         if(!this.field_268[var3++]) {
            ++var2;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (int) int
   public final int method_195(int var1) {
      int var2 = 0;
      int var3 = 0;

      while(var2 != var1) {
         if(!this.field_268[var3++]) {
            ++var2;
         }
      }

      return var3;
   }

   // $FF: renamed from: a (int, int) int
   public final int method_196(int var1, int var2) {
      int var3 = 0;

      for(int var4 = var1; var4 < var2 + 1; ++var4) {
         if(!this.field_268[var4]) {
            ++var3;
         }
      }

      return var3;
   }

   // $FF: renamed from: a () int
   public final int method_197() {
      return this.field_265 - this.method_196(0, this.field_265 - 1);
   }

   // $FF: renamed from: a () void
   public final void method_198() {
      this.field_266 = 0;
      if(this.method_197() != this.field_265) {
         while(this.field_268[this.field_266]) {
            ++this.field_266;
         }
      }

      this.field_269 = this.field_266;
   }

   // $FF: renamed from: a (boolean) void
   public final void method_199(boolean var1) {
      if(this.method_197() != this.field_265) {
         byte var2 = 1;
         if(var1) {
            var2 = -1;
         }

         do {
            this.field_269 += var2;
            if(this.field_269 >= this.field_265) {
               this.field_269 = 0;
            }

            if(this.field_269 < 0) {
               this.field_269 = this.field_265 - 1;
            }
         } while(this.field_268[this.field_269]);

         if(this.field_267 != this.field_265) {
            int var3 = this.method_194(this.field_269);
            int var4 = this.method_194(this.field_266);
            if(var3 - 1 < var4) {
               if(var3 != 0) {
                  var4 = var3 - 1;
               } else {
                  var4 = 0;
               }
            }

            if(var4 + this.field_267 < var3 + 2) {
               var4 = var3 - this.field_267 + 2;
               int var5 = this.method_196(0, this.field_265 - 1);
               if(var4 + this.field_267 > var5) {
                  var4 = var5 - this.field_267;
               }
            }

            this.field_266 = this.method_195(var4);
         }

      }
   }
}
