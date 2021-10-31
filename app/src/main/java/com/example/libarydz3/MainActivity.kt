package com.example.libarydz3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.libarydz3.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    private val presenter by moxyPresenter { MainPresenter(CountersModel()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.button1?.setOnClickListener { presenter.behaviorSubject.onNext(ButtonType.BUTTON_ONE) }
        vb?.button2?.setOnClickListener { presenter.behaviorSubject.onNext(ButtonType.BUTTON_TWO) }
        vb?.button3?.setOnClickListener { presenter.behaviorSubject.onNext(ButtonType.BUTTON_THREE) }
    }

    override fun setButtonOneImage(imageId: Int) {
        vb?.image?.setImageResource(imageId)
    }

    override fun setButtonTwoImage(imageId: Int) {
        vb?.image?.setImageResource(imageId)
    }

    override fun setButtonThreeImage(imageId: Int) {
        vb?.image?.setImageResource(imageId)
    }


}