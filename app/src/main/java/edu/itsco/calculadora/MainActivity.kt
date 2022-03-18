package edu.itsco.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var btnSuma:Button
    private lateinit var btnResta:Button
    private lateinit var btnMultiplicacion:Button
    private lateinit var btnDivision:Button
    private lateinit var btnPunto:Button
    private lateinit var btnIgual:Button
    private lateinit var btnPorcentaje:Button
    private lateinit var btnBorrar:Button

    private lateinit var btnUno:Button
    private lateinit var btnDos:Button
    private lateinit var btnTres:Button
    private lateinit var btnCuatro:Button
    private lateinit var btnCinco:Button
    private lateinit var btnSeis:Button
    private lateinit var btnSiete:Button
    private lateinit var btnOcho:Button
    private lateinit var btnNueve:Button
    private lateinit var btnCero:Button

    private var auxiliar=""
    private var resultado=0.0
    private var signo=""

    private lateinit var txtNumeros:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumeros=findViewById(R.id.txt_numeros)

        btnCero=findViewById(R.id.btn_cero)
        btnUno=findViewById(R.id.btn_uno)
        btnDos=findViewById(R.id.btn_dos)
        btnTres=findViewById(R.id.btn_tres)
        btnCuatro=findViewById(R.id.btn_cuatro)
        btnCinco=findViewById(R.id.btn_cinco)
        btnSeis=findViewById(R.id.btn_seis)
        btnSiete=findViewById(R.id.btn_siete)
        btnOcho=findViewById(R.id.btn_ocho)
        btnNueve=findViewById(R.id.btn_nueve)

        btnSuma=findViewById(R.id.btn_suma)
        btnResta=findViewById(R.id.btn_resta)
        btnMultiplicacion=findViewById(R.id.btn_multiplicacion)
        btnDivision=findViewById(R.id.btn_division)
        btnPunto=findViewById(R.id.btn_punto)
        btnPorcentaje=findViewById(R.id.btn_porcentaje)
        btnIgual=findViewById(R.id.btn_igual)
        btnBorrar=findViewById(R.id.btn_borrar)

        btnCero.setOnClickListener(this)
        btnUno.setOnClickListener(this)
        btnDos.setOnClickListener(this)
        btnTres.setOnClickListener(this)
        btnCuatro.setOnClickListener(this)
        btnCinco.setOnClickListener(this)
        btnSeis.setOnClickListener(this)
        btnSiete.setOnClickListener(this)
        btnOcho.setOnClickListener(this)
        btnNueve.setOnClickListener(this)

        btnSuma.setOnClickListener(this)
        btnResta.setOnClickListener(this)
        btnMultiplicacion.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
        btnPunto.setOnClickListener(this)
        btnPorcentaje.setOnClickListener(this)
        btnIgual.setOnClickListener(this)
        btnBorrar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.btn_cero -> {auxiliar += "0"
                txtNumeros.text=auxiliar
            }
            R.id.btn_uno -> {auxiliar += "1"
                txtNumeros.text=auxiliar
            }
            R.id.btn_dos -> {auxiliar += "2"
                txtNumeros.text=auxiliar
            }
            R.id.btn_tres -> {auxiliar += "3"
                txtNumeros.text=auxiliar
            }
            R.id.btn_cuatro -> {auxiliar += "4"
                txtNumeros.text=auxiliar
            }
            R.id.btn_cinco -> {auxiliar += "5"
                txtNumeros.text=auxiliar
            }
            R.id.btn_seis -> {auxiliar += "6"
                txtNumeros.text=auxiliar
            }
            R.id.btn_siete -> {auxiliar += "7"
                txtNumeros.text=auxiliar
            }
            R.id.btn_ocho -> {auxiliar += "8"
                txtNumeros.text=auxiliar
            }
            R.id.btn_nueve -> {auxiliar += "9"
                txtNumeros.text=auxiliar
            }
            R.id.btn_punto -> {auxiliar+="."
                txtNumeros.text=auxiliar
            }
            R.id.btn_borrar -> {
                auxiliar=""
                txtNumeros.text= 0.toString()
                resultado=0.0
                signo=""
            }
            R.id.btn_porcentaje -> {
                if(resultado!=0.0){
                    resultado=resultado/100
                    auxiliar=""
                }
                else{
                    resultado=auxiliar.toDouble()/100
                }
                txtNumeros.text=resultado.toString()
            }
            R.id.btn_suma -> {
                if(resultado==0.0){
                    resultado=auxiliar.toDouble()
                    auxiliar=""
                }else{
                    if(signo!=""){
                        if(signo=="+"){
                            resultado=resultado+auxiliar.toDouble()
                            txtNumeros.text=resultado.toString()
                        }
                        else{
                            if (signo=="-"){
                                resultado=resultado-auxiliar.toDouble()
                                txtNumeros.text=resultado.toString()
                            }
                            else{
                                if(signo=="*"){
                                    resultado=resultado*auxiliar.toDouble()
                                    txtNumeros.text=resultado.toString()
                                }
                                else{
                                    if(signo=="/") {
                                        resultado = resultado / auxiliar.toDouble()
                                        txtNumeros.text = resultado.toString()
                                    }
                                }
                            }
                        }
                    }
                    auxiliar=""
                }
                signo="+"
                txtNumeros.text="0"
            }
            R.id.btn_resta -> {
                if(resultado==0.0){
                    resultado=auxiliar.toDouble()
                    auxiliar=""
                }else{
                    if(signo!=""){
                        if(signo=="+"){
                            resultado=resultado+auxiliar.toDouble()
                            txtNumeros.text=resultado.toString()
                        }
                        else{
                            if (signo=="-"){
                                resultado=resultado-auxiliar.toDouble()
                                txtNumeros.text=resultado.toString()
                            }
                            else{
                                if(signo=="*"){
                                    resultado=resultado*auxiliar.toDouble()
                                    txtNumeros.text=resultado.toString()
                                }
                                else{
                                    if(signo=="/") {
                                        resultado = resultado / auxiliar.toDouble()
                                        txtNumeros.text = resultado.toString()
                                    }
                                }
                            }
                        }
                    }
                    auxiliar=""
                }
                signo="-"
                txtNumeros.text="0"
            }
            R.id.btn_multiplicacion -> {
                if(resultado==0.0){
                    resultado=auxiliar.toDouble()
                    auxiliar=""
                }else{
                    if(signo!=""){
                        if(signo=="+"){
                            resultado=resultado+auxiliar.toDouble()
                            txtNumeros.text=resultado.toString()
                        }
                        else{
                            if (signo=="-"){
                                resultado=resultado-auxiliar.toDouble()
                                txtNumeros.text=resultado.toString()
                            }
                            else{
                                if(signo=="*"){
                                    resultado=resultado*auxiliar.toDouble()
                                    txtNumeros.text=resultado.toString()
                                }
                                else{
                                    if(signo=="/") {
                                        resultado = resultado / auxiliar.toDouble()
                                        txtNumeros.text = resultado.toString()
                                    }
                                }
                            }
                        }
                    }
                    auxiliar=""
                }
                signo="*"
                txtNumeros.text="0"
            }
            R.id.btn_division -> {
                if(resultado==0.0){
                    resultado=auxiliar.toDouble()
                    auxiliar=""
                }else{
                    if(signo!=""){
                        if(signo=="+"){
                            resultado=resultado+auxiliar.toDouble()
                            txtNumeros.text=resultado.toString()
                        }
                        else{
                            if (signo=="-"){
                                resultado=resultado-auxiliar.toDouble()
                                txtNumeros.text=resultado.toString()
                            }
                            else{
                                if(signo=="*"){
                                    resultado=resultado*auxiliar.toDouble()
                                    txtNumeros.text=resultado.toString()
                                }
                                else{
                                    if(signo=="/") {
                                        resultado = resultado / auxiliar.toDouble()
                                        txtNumeros.text = resultado.toString()
                                    }
                                }
                            }
                        }
                    }
                    auxiliar=""
                }
                signo="/"
                txtNumeros.text="0"
            }
            R.id.btn_igual -> {
                if(signo=="+"){
                    resultado=resultado+auxiliar.toDouble()
                    txtNumeros.text=resultado.toString()
                }
                else{
                    if (signo=="-"){
                        resultado=resultado-auxiliar.toDouble()
                        txtNumeros.text=resultado.toString()
                    }
                    else{
                        if(signo=="*"){
                            resultado=resultado*auxiliar.toDouble()
                            txtNumeros.text=resultado.toString()
                        }
                        else{
                            if(signo=="/") {
                                resultado = resultado / auxiliar.toDouble()
                                txtNumeros.text = resultado.toString()
                            }
                        }
                    }
                }
            }
        }
    }
}