package com.hardeep.project.adapter;

import android.content.Context;
import android.location.Address;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardeep.project.R;
import com.hardeep.project.model.VaccineModel;

import java.util.List;

public class VaccinationInfoAdapter extends RecyclerView.Adapter<VaccinationInfoAdapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<VaccineModel> list_vaccine_center;

    public VaccinationInfoAdapter(Context mcontext, List<VaccineModel> list_vaccine_center) {
        this.layoutInflater = layoutInflater.from(mcontext);
        this.list_vaccine_center = list_vaccine_center;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.vaccination_info_item,parent,false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.vaccinationCenter.setText(list_vaccine_center.get(position).getVaccineCenter());
        holder.vaccinationCenterAddress.setText(list_vaccine_center.get(position).getVaccinationCenterAddress());
        holder.vaccinationTiming.setText(list_vaccine_center.get(position).getVacccintionTimings() +" - "+
                list_vaccine_center.get(position).getVaccineCenterTime());
        holder.vaccineName.setText(list_vaccine_center.get(position).getVaccineName());
        holder.vaccinationAvailable.setText(list_vaccine_center.get(position).getVaccineAvailable());
        holder.vaccineCharges.setText(list_vaccine_center.get(position).getVaccintionCharges());
        holder.vaccinationAge.setText(list_vaccine_center.get(position).getVaccinationAge());
    }

    @Override
    public int getItemCount() {
        return list_vaccine_center.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        TextView vaccinationCenter;
        TextView vaccinationCenterAddress;
        TextView vaccinationTiming;
        TextView vaccineName;
        TextView vaccineCharges;
        TextView vaccinationAge;
        TextView vaccinationAvailable;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            vaccinationAge = itemView.findViewById(R.id.VaccineAge);
            vaccinationAvailable = itemView.findViewById(R.id.isAvailable);
            vaccineCharges = itemView.findViewById(R.id.VaccineCharges);
            vaccineName = itemView.findViewById(R.id.VaccineName);
            vaccinationTiming = itemView.findViewById(R.id.vaccineTimings);
            vaccinationCenterAddress = itemView.findViewById(R.id.vaccinelocation);
        }
    }

}
