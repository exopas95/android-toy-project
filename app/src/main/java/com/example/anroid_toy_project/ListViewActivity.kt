package com.example.anroid_toy_project

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        // 아이템 리스트 준비
        val carList = ArrayList<CarForList>()
        for(i in 0 until 10) {
            carList.add(CarForList("$i 번째 자동차", "" + i + "순위 엔진"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from(this@ListViewActivity))
        val view = findViewById<ListView>(R.id.listView)
        view.adapter = adapter
        view.setOnItemClickListener { adapterView, view, i, l ->
            val carName = (adapter.getItem(i) as CarForList).name
            val carEngine = (adapter.getItem(i) as CarForList).engine

            Toast.makeText(this@ListViewActivity, "$carName $carEngine", Toast.LENGTH_LONG).show()

        }
    }
}

class ListViewAdapter(
    val carForList: ArrayList<CarForList>,
    val layoutInflater: LayoutInflater

) : BaseAdapter() {
    override fun getCount(): Int {
        // 그리고자 하는 아이템 리스트의 전체 개수
        return carForList.size
    }

    override fun getItem(p0: Int): Any {
        // 그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
        return carForList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        // 해당 포지션에 위치해 있는 아이템 뷰의 아이디 설
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        // findViewById를 사용하는 방법
//        val view = layoutInflater.inflate(R.layout.item_view, null)
//        val carNameTextView = view.findViewById<TextView>(R.id.car_name)
//        val carEngineTextView = view.findViewById<TextView>(R.id.car_engine)
//
//        carNameTextView.setText(carForList.get(p0).name)
//        carEngineTextView.setText(carForList.get(p0).name)
//
//        return view

        // ViewHolder를 사용하는 방법법
        val view: View
        val holder: ViewHolder

        if (p1 == null) {
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()
            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)
            view.tag = holder
        } else {
            holder = p1.tag as ViewHolder
            view = p1
        }
        holder.carName?.setText(carForList.get(p0).name)
        holder.carEngine?.setText(carForList.get(p0).engine)

        return view
    }
}
class ViewHolder {
    var carName: TextView? = null
    var carEngine: TextView? = null
}