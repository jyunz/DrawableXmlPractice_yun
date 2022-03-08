package com.example.drawablexmlpractice_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        커스텀 액션바를 쓰기위해
//        1. 기본 액션바를 불러낸다.
        val defaultActionBar = supportActionBar!!

//        모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

//        어떤 커스텀 뷰를 사용할 껀지?

        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)

//        양 옆의 여백제거 ==> 커스텀 액션바를 들고있는 툴바를 찾아내서 여백 제거
//        커스텀 뷰를 들고있는 툴바를 변수에 저장

        val toolbar = defaultActionBar.customView.parent as androidx.appcompat.widget.Toolbar
        toolbar.setContentInsetsAbsolute(0,0)


    }
}
