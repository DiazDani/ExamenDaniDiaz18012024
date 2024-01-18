package com.example.examendanidiaz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examendanidiaz.R
import com.example.examendanidiaz.database.Alumnes

class AlumneAdapter(private val alumnes: List<Alumnes>, private val onItemClick: (Alumnes) -> Unit) :
    RecyclerView.Adapter<AlumneAdapter.AlumneViewHolder>() {

    class AlumneViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        var nom: TextView = view.findViewById(R.id.name)
        var grup: TextView = view.findViewById(R.id.group)
        var nota: TextView = view.findViewById(R.id.grade)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):AlumneViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumne,parent,false)
        return AlumneViewHolder(view)
    }

    override fun getItemCount() = alumnes.size


    override fun onBindViewHolder(holder: AlumneViewHolder, position: Int) {
        val studients= alumnes[position]

        holder.itemView.setOnClickListener {
            onItemClick.invoke(studients)
        }
        holder.nom.text=studients.Name
        holder.grup.text=studients.Group
        holder.nota.text=studients.Grade.toString() + "€"
    }

}