package com.example.anroid_toy_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.anroid_toy_project.databinding.ActivityRecyclerViewBinding

class ActivityRecyclerViewBinding : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // 아이템 리스트 준비
        val carList = ArrayList<CarForList>()
        for(i in 0 until 10) {
            carList.add(CarForList("$i 번째 자동차", "" + i + "순위 엔진"))
        }

        val adapter = RecyclerAdapter(carList, LayoutInflater.from(this@ActivityRecyclerViewBinding))
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this@ActivityRecyclerViewBinding)
//        binding.recyclerView.layoutManager = GridLayoutManager(this@ActivityRecyclerViewBinding, 2)
    }
}

class RecyclerAdapter(
    val itemList : ArrayList<CarForList>,
    val inflater : LayoutInflater
): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val carName: TextView
        val carEngine: TextView

        init{
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)
            itemView.setOnClickListener {
                val position: Int = bindingAdapterPosition
                val engineName = itemList.get(position).engine
                Log.d("engine", engineName)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.carName.setText(itemList.get(position).name)
        holder.carEngine.setText(itemList.get(position).engine)
    }
}

