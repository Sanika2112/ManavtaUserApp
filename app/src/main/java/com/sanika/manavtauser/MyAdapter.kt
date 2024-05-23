package com.sanika.manavtauser
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(private val context: android.content.Context, private var dataList:List<DataClass>):RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(dataList[position].dataImage).into(holder.recImage)
        holder.recNGO.text=dataList[position].dataNGO
        holder.recCard.setOnClickListener{
            val intent = Intent(context,DetailActivity::class.java)
            intent.putExtra("Image", dataList[holder.adapterPosition].dataImage)
            intent.putExtra("NGO", dataList[holder.adapterPosition].dataNGO)
            intent.putExtra("Founder", dataList[holder.adapterPosition].dataFounder)
            intent.putExtra("Description", dataList[holder.adapterPosition].dataDescription)
            intent.putExtra("Address", dataList[holder.adapterPosition].dataAddress)
            intent.putExtra("Contact no.", dataList[holder.adapterPosition].dataContact)
            intent.putExtra("Email", dataList[holder.adapterPosition].dataEmail)
            intent.putExtra("Website", dataList[holder.adapterPosition].dataWebsite)
            intent.putExtra("Donate", dataList[holder.adapterPosition].dataDonate)
            intent.putExtra("Key", dataList[holder.adapterPosition].key)

            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
    fun searchDataList(searchList: List<DataClass>){
        dataList=searchList
        notifyDataSetChanged()

    }

}

class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var recImage: ImageView
    var recCard: CardView
    var recNGO: TextView

    init {
        recImage=itemView.findViewById(R.id.recImage)
        recCard=itemView.findViewById(R.id.recCard)
        recNGO=itemView.findViewById(R.id.recNGO)
    }
}
