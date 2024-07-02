import java.util.*

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        var visited: HashMap<Int, Boolean> = hashMapOf()
        var q: Queue<Pair<Int, Int>> = LinkedList()
        var answer: Int = 1000000
        
        fun exec(y: Int, type: Int) = when (type) {
            0 -> y - n
            1 -> if (y % 2 == 0) y / 2 else 0
            else -> if (y % 3 == 0) y / 3 else 0
        }
        
        fun solve(y: Int, cnt: Int) {
            q.add(y to cnt)
            
            while (q.isNotEmpty()) {
                // 첫 번재 Pair 값 대입 및 삭제
                val (current, count) = q.poll()

                if (current == x) {
                    answer = count
                    return
                }

                (0..2).map {
                    val next = exec(current, it)
                    if (next >= x && !(visited[next] ?: false)) {
                        visited[next] = true
                        q.add(next to count + 1)
                    }
                }
            }
            answer = -1
            return
        }
        
        solve(y, 0)
        
        return answer
    }
}

// const bfs=()=>{
//     let queue=[[y,0]];
//     let visit={};
//     visit[y]=1;

//     while(queue.length){
//         let [cur,count]=queue.shift();

//         if(cur===x) return count;

//         for(let i=0;i<3;++i){
//             let next=calc(cur,i);
//             if(next>=x && !visit[next]){
//                 visit[next]=1;
//                 queue.push([next,count+1]);
//             }
//         }
//     }

//     return -1;
// }