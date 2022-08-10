# algorithm

알고리즘을 연습해보자

## 1. Sort

### [Bubble Sort](src/sort/BubbleSort.java)

* `Worst : O(n^2)`

### [Selection Sort](src/sort/SelectionSort.java)

* `Worst : O(n^2)`

### [Insertion Sort](src/sort/InsertionSort.java)

* `Best : Ω(n)` // 최적의 경우 비교를 한번만! 
* `Worst : O(n^2)`

### [Merge Sort](src/sort/MergeSort.java)

Divide and Conquer

* `Worst : O(nlogn)`

  생각보다 느림..

### [Quick Sort](src/sort/QuickSort.java)

Divide and Conquer

* `Best : Ω(nlogn)`
* `Worst : O(n^2)`

최악의 경우 O(n^2)까지 소요되지만, 일반적으로는 속도가 빠른 알고리즘, 임계값을 통한 삽입 정렬과의 호환으로 사용 시 효율이 좋음

## 2. Search

### [Depth-first Search](src/search/DFS.java)

* `Worst : O(V + E)` // V = 정점의 수(노드의 수), E = 간선의 수(에지의 수)

최단 거리임을 보장할 수 없음

### [Breadth-first Search (BFS)](src/search/BFS.java)

* `Worst : O(V + E)` // V = 정점의 수(노드의 수), E = 간선의 수(에지의 수)

최단 거리 경로 탐색





