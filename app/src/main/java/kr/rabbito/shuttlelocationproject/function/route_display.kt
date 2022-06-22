package kr.rabbito.shuttlelocationproject.function

import android.graphics.Color
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.*
import kr.rabbito.shuttlelocationproject.data.tuk_route_down
import kr.rabbito.shuttlelocationproject.data.tuk_route_up

fun showRoute(googleMap: GoogleMap, route_up: Array<LatLng>, route_down: Array<LatLng>){
    lateinit var polylineOptions: PolylineOptions
    lateinit var mMap: GoogleMap
    mMap = googleMap
    var arrayPoints = arrayListOf<LatLng>()
    //Clearbut = findViewById<Button>(R.id.butClear)
    //val lng2 = LatLng(37.620215, 126.824540)
    // 카메라 옮길 때 확대 축소 가능 newLatLngZoom
    //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lng2, 16f))

    // 경로 위치 배열 예시
    /**var route = arrayOf(LatLng(37.619232, 126.828336),LatLng(37.619757, 126.825937), LatLng(37.620215, 126.824540)
    , LatLng(37.622870, 126.824565), LatLng(37.623729, 126.824534)
    , LatLng(37.628849, 126.822987), LatLng(37.627379, 126.828018))
     * */

    // 배열에 있는 값들로 경로 추가
    for(i in 0..route_up.count()-1){
        polylineOptions = PolylineOptions()
        polylineOptions.color(Color.parseColor("#E87326"))
        polylineOptions.width(7F)
        arrayPoints.add(route_up[i])
        polylineOptions.addAll(arrayPoints)
        mMap.addPolyline(polylineOptions)
    }
    for(i in 0..route_down.count()-1){
        polylineOptions = PolylineOptions()
        polylineOptions.color(Color.parseColor("#E87326"))
        polylineOptions.width(7F)
        arrayPoints.add(route_down[i])
        polylineOptions.addAll(arrayPoints)
        mMap.addPolyline(polylineOptions)
    }


    /*
    Clearbut.setOnClickListener{
        mMap.clear()
        arrayPoints.clear()
    }

     */
}