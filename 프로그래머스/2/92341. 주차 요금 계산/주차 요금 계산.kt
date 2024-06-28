class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val recordsMap = records.map { it.split(" ") }
            .groupBy({ it[1] }, 
                     { it[0].split(":").let { n -> n[0].toInt()*60+n[1].toInt() }})
        
        return recordsMap.map { car ->
            val times = car.value.chunked(2).fold(0) { total, v -> 
                total + if (v.size == 1) 23*60 + 59 - v[0] else v[1] - v[0]
            }
            // fees: [기본 시간, 기본 요금, 단위 시간, 단위 요금]
            var cost = fees[1] + if (times <= fees[0]) 0 else (times - fees[0]) / fees[2] * fees[3]
            car.key to if ((times - fees[0]) % fees[2] > 0) cost + fees[3] else cost
        }.sortedBy { it.first }.map { it.second }.toIntArray()
    }
}