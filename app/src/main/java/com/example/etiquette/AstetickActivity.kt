package com.example.etiquette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AstetickActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_astetick)
        val textView:TextView=findViewById(R.id.textView4)
        textView.setText("Этикет — очень важная часть общечеловеческой культуры, выработанная на протяжении многих веков всеми народами в соответствии с их представлениями о добре, справедливости, нравственности, а также о красоте, порядке, благоустройстве, бытовой целесообразности.\n" +
                "Польза этикета в том, что он является законом, определяющим обязанности, которые следует выполнять, и границы, которые нельзя преступать.\n" +
                "Наша жизнь полна самых разнообразных событий - радостных и печальных, заурядных и совершенно неординарных.\n" +
                "И где бы мы ни оказались - на работе, в магазине, в транспорте, на прогулке или в туристической поездке, нам приходится выбирать соответствующий стиль поведения, то есть соблюдать правила этикета для того, чтобы выглядеть достойно и не вызывать неловкости у окружающих.\n" +
                "Мы не можем отделять свою жизнь от жизни других людей, и нам приходится выстраивать свое поведение, соблюдая правила этикета, чтобы всем, кто находится рядом с нами, было комфортно.\n" +
                "Именно наше поведение, речь, манеры, стиль одежды, умение держаться в обществе свидетельствуют об уровне нашей культуры и нравственном воспитании.\n" +
                "От впечатления, которое мы производим на окружающих, во многом зависит наш успех, как в общественной, так и в личной жизни.\n" +
                "Правила этикета не являются абсолютными: они определяются местом, временем и обстоятельствами.\n" +
                "Поведение, допустимое в одном случае, может показаться совершенно неуместным в другом.\n" +
                "О человеке, который знает правила этикета и умеет их применять, говорят, что он хорошо воспитан, владеет культурой общения и поведения.\n" +
                "Основными видами этикета являются: государственный (придворный), дипломатический, воинский, религиозный, общегражданский.\n" +
                "Общегражданский этикет имеет несколько подвидов: деловой, светский, столовый, обрядовый и др.")
    }

}