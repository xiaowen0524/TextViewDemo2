package com.bawei.asus.textviewdemo2;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textview1, textview2, textview3, textview4, textview5, textview6, textview7, textview8, textview9, textview10;
    private TextView textview11, textview12, textview13, textview14, textview15, textview16, textview17, textview18, textview19, textview20, textview21;
    private SpannableString spanText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yi();
        er();
        san();
        si();
        wu();
        liu();
        qi();
        ba();
        jiu();
        shi();
        shiyi();
        shier();
        shisan();
        shisi();
        shiwu();
        shiliu();
        shiqi();
        shiba();
        shijiu();
        ershi();
        ershiyi();

    }

    public void yi() {
        textview1 = (TextView) findViewById(R.id.textview1);
        spanText = new SpannableString("在代码中改变TextView中指定的某一段话的背景颜色");
        spanText.setSpan(new BackgroundColorSpan(Color.CYAN), 5, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        /*Spanned.SPAN_EXCLUSIVE_EXCLUSIVE(前后都不包括)、Spanned.SPAN_INCLUSIVE_EXCLUSIVE(前面包括，后面不包括)、Spanned.SPAN_EXCLUSIVE_INCLUSIVE(前面不包括，后面包括)、Spanned.SPAN_INCLUSIVE_INCLUSIVE(前后都包括)*/
        textview1.append("\n");
        textview1.append(spanText);
    }

    public void er() {
        textview2 = (TextView) findViewById(R.id.textview2);
        spanText = new SpannableString("在代码中给TextView中指定的某一段话设置监听事件");
        spanText.setSpan(new ClickableSpan() {
                             @Override
                             public void onClick(View widget) {
                                 Toast.makeText(MainActivity.this, "您点击了代码两个字", Toast.LENGTH_SHORT).show();
                             }
                         }, 5, 13,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        /*Spanned.SPAN_EXCLUSIVE_EXCLUSIVE(前后都不包括)、Spanned.SPAN_INCLUSIVE_EXCLUSIVE(前面包括，后面不包括)、Spanned.SPAN_EXCLUSIVE_INCLUSIVE(前面不包括，后面包括)、Spanned.SPAN_INCLUSIVE_INCLUSIVE(前后都包括)*/
        textview2.append("\n");
        textview2.append(spanText);
    }

    public void san() {
        textview3 = (TextView) findViewById(R.id.textview3);
        spanText = new SpannableString("在代码中改变TextView中指定的某一段话的字体颜色");
        spanText.setSpan(new ForegroundColorSpan(Color.BLUE), 18, 22,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        /*Spanned.SPAN_EXCLUSIVE_EXCLUSIVE(前后都不包括)、Spanned.SPAN_INCLUSIVE_EXCLUSIVE(前面包括，后面不包括)、Spanned.SPAN_EXCLUSIVE_INCLUSIVE(前面不包括，后面包括)、Spanned.SPAN_INCLUSIVE_INCLUSIVE(前后都包括)*/
        textview3.append("\n");
        textview3.append(spanText);
    }

    public void si() {
        textview4 = (TextView) findViewById(R.id.textview4);
        spanText = new SpannableString("MaskFilterSpan -- 修饰效果，如 模// 糊(BlurMaskFilter)、浮雕(EmbossMaskFilter)");
        int length = spanText.length();
//模糊(BlurMaskFilter)
        MaskFilterSpan maskFilterSpan = new MaskFilterSpan(new BlurMaskFilter(3, BlurMaskFilter.Blur.OUTER));
        spanText.setSpan(maskFilterSpan, 0, length - 10, Spannable.
                SPAN_INCLUSIVE_EXCLUSIVE);
//浮雕(EmbossMaskFilter)
        maskFilterSpan = new MaskFilterSpan(new EmbossMaskFilter(new float[]{1, 1, 3}, 1.5f, 8, 3));
        spanText.setSpan(maskFilterSpan, length - 10, length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview4.append("\n");
        textview4.append(spanText);
    }

    public void wu() {
        textview5 = (TextView) findViewById(R.id.textview5);
        spanText = new SpannableString("MetricAffectingSpan 父类，一般不用");
        spanText.setSpan(new MetricAffectingSpan() {
                             @Override
                             public void updateMeasureState(TextPaint p) {

                             }

                             @Override
                             public void updateDrawState(TextPaint tp) {

                             }
                         }, 18, 22,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        /*Spanned.SPAN_EXCLUSIVE_EXCLUSIVE(前后都不包括)、Spanned.SPAN_INCLUSIVE_EXCLUSIVE(前面包括，后面不包括)、Spanned.SPAN_EXCLUSIVE_INCLUSIVE(前面不包括，后面包括)、Spanned.SPAN_INCLUSIVE_INCLUSIVE(前后都包括)*/
        textview5.append("\n");
        textview5.append(spanText);
    }

    public void liu() {
        textview6 = (TextView) findViewById(R.id.textview6);
        spanText = new SpannableString("跟删除线差不多");
        spanText.setSpan(new StrikethroughSpan(), 0, 7, Spannable.
                SPAN_INCLUSIVE_EXCLUSIVE);
        textview6.append("\n");
        textview6.append(spanText);
    }

    public void qi() {
        textview7 = (TextView) findViewById(R.id.textview7);
        spanText = new SpannableString("StrikethroughSpan删除线（中划线）");
        spanText.setSpan(new StrikethroughSpan(), 17, 20, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview7.append("\n");
        textview7.append(spanText);
    }

    public void ba() {
        textview8 = (TextView) findViewById(R.id.textview8);
        spanText = new SpannableString("SpannableString相当于占位符");
        spanText.setSpan(new StrikethroughSpan(), 17, 20, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview8.append("\n");
        textview8.append(spanText);
    }

    public void jiu() {
        textview9 = (TextView) findViewById(R.id.textview9);
        spanText = new SpannableString("下划线");
        spanText.setSpan(new UnderlineSpan(), 0, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview9.append("\n");
        textview9.append(spanText);
    }

    public void shi() {
        textview10 = (TextView) findViewById(R.id.textview10);
        spanText = new SpannableString("AbsoluteSizeSpan");
        spanText.setSpan(new AbsoluteSizeSpan(20, true), 0, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview10.append("\n");
        textview10.append(spanText);
    }

    public void shiyi() {
        textview11 = (TextView) findViewById(R.id.textview11);
        DynamicDrawableSpan drawableSpan =
                new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BASELINE) {
                    @Override
                    public Drawable getDrawable() {
                        Drawable d = getResources().getDrawable(R.drawable.ic_launcher);
                        d.setBounds(0, 0, 50, 50);
                        return d;
                    }
                };
        DynamicDrawableSpan drawableSpan2 = new DynamicDrawableSpan(
                DynamicDrawableSpan.ALIGN_BOTTOM) {
            @Override
            public Drawable getDrawable() {
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher);
                d.setBounds(0, 0, 50, 50);
                return d;
            }
        };
        spanText.setSpan(drawableSpan, 3, 4, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText.setSpan(drawableSpan2, 7, 8, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview11.append("\n");
        textview11.append(spanText);
    }

    public void shier() {
        textview12 = (TextView) findViewById(R.id.textview12);
        spanText = new SpannableString("ImageSpan");
        Drawable d = getResources().getDrawable(R.drawable.ic_launcher);
        d.setBounds(0, 0, 50, 50);
        spanText.setSpan(new ImageSpan(d), 3, 4, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview12.append("\n");
        textview12.append(spanText);
    }

    public void shisan() {
        textview13 = (TextView) findViewById(R.id.textview13);
        spanText = new SpannableString("RelativeSizeSpan");
//参数proportion:比例大小
        spanText.setSpan(new RelativeSizeSpan(2.5f), 3, 4,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview13.append("\n");
        textview13.append(spanText);
    }

    public void shisi() {
        textview10 = (TextView) findViewById(R.id.textview10);
    }

    public void shiwu() {
        textview15 = (TextView) findViewById(R.id.textview15);
        spanText = new SpannableString("ScaleXSpan");
//参数proportion:比例大小
        spanText.setSpan(new ScaleXSpan(3.8f), 3, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview15.append("\n");
        textview15.append(spanText);
    }

    public void shiliu() {
        textview16 = (TextView) findViewById(R.id.textview16);
        spanText = new SpannableString("StyleSpan");
//Typeface.BOLD_ITALIC:粗体+斜体
        spanText.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 3, 7,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview16.append("\n");
        textview16.append(spanText);
    }

    public void shiqi() {
        textview17 = (TextView) findViewById(R.id.textview17);
        spanText = new SpannableString("1234567890987654321");
        spanText.setSpan(new SubscriptSpan(), 6, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview17.append("\n");
        textview17.append(spanText);
    }

    public void shiba() {
        textview18 = (TextView) findViewById(R.id.textview18);
        spanText = new SpannableString("1234567890987654321");
        spanText.setSpan(new SuperscriptSpan(), 6, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview18.append("\n");
        textview18.append(spanText);
    }

    public void shijiu() {
        textview19 = (TextView) findViewById(R.id.textview19);
        spanText = new SpannableString("TextAppearanceSpan");
//若需自定义TextAppearance，可以在系统样式上进行修改
        spanText.setSpan(new TextAppearanceSpan(this, android.R.style.TextAppearance_Medium),
                6, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview19.append("\n");
        textview19.append(spanText);
    }

    public void ershi() {
        textview20 = (TextView) findViewById(R.id.textview20);
        spanText = new SpannableString("TypefaceSpan");
//若需使用自定义字体，可能要重写类TypefaceSpan
        spanText.setSpan(new TypefaceSpan("monospace"), 3, 10,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview20.append("\n");
        textview20.append(spanText);
    }

    public void ershiyi() {
        textview21 = (TextView) findViewById(R.id.textview21);
        spanText = new SpannableString("URLSpan -- 文本超链接");
        spanText.setSpan(new URLSpan("http://orgcent.com"), 10, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        textview21.append("\n");
        textview21.append(spanText);
//让URLSpan可以点击
        textview21.setMovementMethod(new LinkMovementMethod());
    }
}
