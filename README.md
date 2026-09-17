# 🚀 10-Week Algorithm Mastery Roadmap (Programmers)

하루 1문제씩 부담 없이 꾸준히 풀 수 있도록, 압축되어 있던 핵심 알고리즘(완전탐색/백트래킹, DFS/BFS, 투포인터/이분탐색, DP)을 **각각 2주씩 세부 테마별로 세분화**한 10주 집중 로드맵입니다.

매주 **수요일 시작 ~ 화요일 복습/오답** 사이클로 구성되어 있으며, **[Lv.1 웜업 2제 → Lv.2 핵심 3제 → Lv.2 고난도/Lv.3 도전 1제 → 화요일 복습]** 패턴으로 점진적으로 난이도가 상승합니다.

---

## 📌 Rules & Guidelines
1. **타임어택 규칙**: 문제당 최대 고민 시간은 **40분**입니다. 풀리지 않을 경우 해설/힌트를 확인한 뒤 반드시 **직접 백지 상태에서 재구현**합니다.
2. **템플릿 체화**: 스택 모노톤, Deque 시뮬레이션, PriorityQueue 스케줄링, 2차원 BFS 격자 탐색, 백트래킹 상태 복원, Parametric Search 뼈대 코드는 즉시 타이핑할 수 있을 정도로 익힙니다.
3. **화요일 복습**: 한 주 동안 풀었던 문제의 시간 복잡도를 계산해보고, 다른 사람의 모범 답안 확인 및 취약 유형을 리팩토링합니다.

---

## 📅 Weekly Schedule

### Week 1. 해시 & 스택 기초/응용
> **Goal:** Map/Set 표준 라이브러리 조작 및 LIFO(스택) 자료구조, 단조 스택(Monotonic Stack) 패턴 익히기

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [폰켓몬](https://school.programmers.co.kr/learn/courses/30/lessons/1845) | Lv.1 | `HashSet`을 이용한 중복 제거 및 단순 분기 | [x] |
| **목 (Warm-up)** | [같은 숫자는 싫어](https://school.programmers.co.kr/learn/courses/30/lessons/12906) | Lv.1 | 기본 배열/리스트 순회 및 직전 원소 비교 (스택 원리) | [x] |
| **금** | [올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909) | Lv.2 | 스택(Stack)의 가장 정형화된 짝 맞추기 패턴 | [ ] |
| **토** | [괄호 회전하기](https://school.programmers.co.kr/learn/courses/30/lessons/76502) | Lv.2 | 문자열 회전 시뮬레이션 + 다중 괄호 스택 검증 | [ ] |
| **일** | [주식가격](https://school.programmers.co.kr/learn/courses/30/lessons/42584) | Lv.2 | 스택에 인덱스를 저장하여 가격 하락 시점 추적 | [ ] |
| **월 (Challenge)** | [뒤에 있는 큰 수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/154539) | Lv.2 | $O(N)$ 단조 스택(Monotonic Stack) 최적화 | [ ] |
| **화** | *오답 정리 및 1주차 복습* | - | 스택을 활용한 $O(N^2) 	o O(N)$ 단축 원리 정리 | [ ] |

---

### Week 2. 큐 & 힙 (우선순위 큐) & 시뮬레이션
> **Goal:** Deque/Queue 기반의 대기열 시뮬레이션과 Min/Max Heap을 활용한 실시간 우선순위 제어 익히기

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [카드 뭉치](https://school.programmers.co.kr/learn/courses/30/lessons/159994) | Lv.1 | 두 개의 큐(Queue) 포인터 순서 검증 | [ ] |
| **목** | [기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586) | Lv.2 | 큐(Queue)를 활용한 선입선출 배포 일정 일괄 계산 | [ ] |
| **금** | [프로세스](https://school.programmers.co.kr/learn/courses/30/lessons/42587) | Lv.2 | 조건부 큐 회전 및 우선순위 검사 | [ ] |
| **토** | [더 맵게](https://school.programmers.co.kr/learn/courses/30/lessons/42626) | Lv.2 | `PriorityQueue`(최소 힙)를 이용한 $O(N \log N)$ 풀이 | [ ] |
| **일** | [다리를 지나는 트럭](https://school.programmers.co.kr/learn/courses/30/lessons/42583) | Lv.2 | 큐를 다리로 모델링한 시간 단위 시뮬레이션 | [ ] |
| **월 (Challenge)** | [디스크 컨트롤러](https://school.programmers.co.kr/learn/courses/30/lessons/42627) | Lv.3 | SJF(Shortest Job First) 스케줄링 힙 구현 | [ ] |
| **화** | *오답 정리 및 2주차 복습* | - | 큐와 힙의 시간 복잡도(삽입/삭제 $O(\log N)$) 점검 | [ ] |

---

### Week 3. 정렬 & 복합 해시 & 그리디
> **Goal:** 커스텀 Comparator 정렬 기준 수립, 복합 해시 카운팅 및 탐욕법(Greedy) 정당성 검증

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [K번째수](https://school.programmers.co.kr/learn/courses/30/lessons/42748) | Lv.1 | 배열 슬라이싱 및 기본 정렬 | [ ] |
| **목 (Warm-up)** | [체육복](https://school.programmers.co.kr/learn/courses/30/lessons/42862) | Lv.1 | 그리디 기초 (정렬 후 인접 번호 조건 분기) | [ ] |
| **금** | [의상](https://school.programmers.co.kr/learn/courses/30/lessons/42578) | Lv.2 | `HashMap` 기반 카운팅 및 조합 경우의 수 도출 | [ ] |
| **토** | [가장 큰 수](https://school.programmers.co.kr/learn/courses/30/lessons/42746) | Lv.2 | 문자열 조합 기준 커스텀 정렬 (`(o2+o1).compareTo(o1+o2)`) | [ ] |
| **일** | [H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/42747) | Lv.2 | 정렬 후 경계값 판별 및 논리 구성 | [ ] |
| **월 (Challenge)** | [구명보트](https://school.programmers.co.kr/learn/courses/30/lessons/42885) | Lv.2 | 정렬 기반 양 끝 투 포인터 그리디 매칭 | [ ] |
| **화** | *오답 정리 및 3주차 복습* | - | Comparator 구현 패턴 및 그리디 정당성 복습 | [ ] |

---

### Week 4. 완전 탐색 I: 수학적 탐색 & 시뮬레이션
> **Goal:** 단순 루프, 규칙성 분석, 모든 약수/경우의 수를 직접 전수조사하는 기본 완전탐색 확립

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/42840) | Lv.1 | 반복 패턴 배열 모듈러 연산(`%`) 순회 | [ ] |
| **목 (Warm-up)** | [최소직사각형](https://school.programmers.co.kr/learn/courses/30/lessons/86491) | Lv.1 | 가로/세로 정렬을 통한 관점 전환 | [ ] |
| **금** | [카펫](https://school.programmers.co.kr/learn/courses/30/lessons/42842) | Lv.2 | 약수 쌍 탐색 및 내부/외부 둘레 수식 검증 | [ ] |
| **토** | [점 찍기](https://school.programmers.co.kr/learn/courses/30/lessons/140107) | Lv.2 | 원의 방정식($x^2 + y^2 \le d^2$) 기반 $O(N)$ 완전탐색 | [ ] |
| **일** | [롤케이크 자르기](https://school.programmers.co.kr/learn/courses/30/lessons/132265) | Lv.2 | Map/Set을 활용한 경계선 탐색 시뮬레이션 | [ ] |
| **월 (Challenge)** | [전력망을 둘로 나누기](https://school.programmers.co.kr/learn/courses/30/lessons/86971) | Lv.2 | 간선을 하나씩 끊어보는 완전탐색 + 트리 크기 탐색 | [ ] |
| **화** | *오답 정리 및 4주차 복습* | - | 완전탐색 시간 복잡도($O(N)$ vs $O(N^2)$) 계산 점검 | [ ] |

---

### Week 5. 완전 탐색 II: 순열·조합 & 백트래킹
> **Goal:** 재귀 호출(DFS)을 이용한 순열/조합 생성, 방문 배열 복원(`visited = false`), 가지치기 익히기

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [삼총사](https://school.programmers.co.kr/learn/courses/30/lessons/131705) | Lv.1 | 3개 원소 선택 조합($_{N}C_3$) 기초 | [ ] |
| **목** | [피로도](https://school.programmers.co.kr/learn/courses/30/lessons/87946) | Lv.2 | 순열(Permutation) 백트래킹 기본 템플릿 | [ ] |
| **금** | [소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/42839) | Lv.2 | 문자 조각 순열 조합 + 에라토스테네스의 체 소수 판정 | [ ] |
| **토** | [모음 사전](https://school.programmers.co.kr/learn/courses/30/lessons/84512) | Lv.2 | 5진수 중복 순열 DFS 및 사전 순서 추적 | [ ] |
| **일** | [쿼드압축 후 개수 세기](https://school.programmers.co.kr/learn/courses/30/lessons/68936) | Lv.2 | 4분할 분할 정복(Divide & Conquer) 재귀 탐색 | [ ] |
| **월 (Challenge)** | [N-Queen](https://school.programmers.co.kr/learn/courses/30/lessons/12952) | Lv.2 | 백트래킹의 대표 문제 (행/열/대각선 가지치기) | [ ] |
| **화** | *오답 정리 및 5주차 복습* | - | 백트래킹 템플릿 및 상태 복원 흐름 복습 | [ ] |

---

### Week 6. 그래프 탐색 I: 격자(Grid) 탐색 & BFS 기초
> **Goal:** 2차원 배열 상하좌우(`dx/dy`), 큐를 이용한 최단 경로 탐색 템플릿 완성하기

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [음양 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/76501) | Lv.1 | 단순 분기 연산 웜업 | [ ] |
| **목** | [타겟 넘버](https://school.programmers.co.kr/learn/courses/30/lessons/43165) | Lv.2 | 이진 트리 구조의 재귀 DFS 탐색 | [ ] |
| **금** | [게임 맵 최단거리](https://school.programmers.co.kr/learn/courses/30/lessons/1844) | Lv.2 | 2차원 격자 최단 거리 BFS의 정석 | [ ] |
| **토** | [무인도 여행](https://school.programmers.co.kr/learn/courses/30/lessons/154540) | Lv.2 | 격자 내 독립 구역(Connected Component) 합 계산 | [ ] |
| **일** | [미로 탈출](https://school.programmers.co.kr/learn/courses/30/lessons/159993) | Lv.2 | 레버 경유 2단계 최단거리 BFS ($Start 	o Lever 	o Exit$) | [ ] |
| **월 (Challenge)** | [리코쳇 로봇](https://school.programmers.co.kr/learn/courses/30/lessons/169199) | Lv.2 | 미끄러지는 이동 조건(벽 만날 때까지) BFS 시뮬레이션 | [ ] |
| **화** | *오답 정리 및 6주차 복습* | - | 최단 경로에서 큐 삽입 즉시 방문 처리하는 이유 복습 | [ ] |

---

### Week 7. 그래프 탐색 II: 연결 그래프 & 상태 전이
> **Goal:** 인접 행렬/리스트 기반 연결 요소 탐색, 단어/상태 변환 최단 단계 추적 및 트리 탐색

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [콜라츠 추측](https://school.programmers.co.kr/learn/courses/30/lessons/12943) | Lv.1 | 단순 상태 전이 및 탈출 조건 점검 | [ ] |
| **목** | [배달](https://school.programmers.co.kr/learn/courses/30/lessons/12978) | Lv.2 | 가중치 그래프 다익스트라(Dijkstra) 또는 우선순위 큐 BFS | [ ] |
| **금** | [네트워크](https://school.programmers.co.kr/learn/courses/30/lessons/43162) | Lv.3 | 인접 행렬 그래프의 연결 요소(Connected Component) 개수 | [ ] |
| **토** | [단어 변환](https://school.programmers.co.kr/learn/courses/30/lessons/43163) | Lv.3 | 1글자 차이 상태 전이 그래프 기반 BFS 최단 변환 | [ ] |
| **일** | [가장 먼 노드](https://school.programmers.co.kr/learn/courses/30/lessons/49189) | Lv.3 | 인접 리스트 가중치 없는 그래프 최장 거리 노드 BFS | [ ] |
| **월 (Challenge)** | [여행경로](https://school.programmers.co.kr/learn/courses/30/lessons/43164) | Lv.3 | 오일러 경로 / 모든 간선을 소비하는 백트래킹 DFS | [ ] |
| **화** | *오답 정리 및 7주차 복습* | - | 인접 리스트 구성 및 경로 복원 기법 점검 | [ ] |

---

### Week 8. 선형 탐색 최적화: 투 포인터 & 누적합 & 슬라이딩 윈도우
> **Goal:** 정렬된 수열 또는 연속 구간을 $O(N)$에 제어하는 양 끝 포인터 및 구간합 테크닉 체화

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [예산](https://school.programmers.co.kr/learn/courses/30/lessons/12982) | Lv.1 | 정렬 후 누적합 그리디 감각 잡기 | [ ] |
| **목** | [숫자의 표현](https://school.programmers.co.kr/learn/courses/30/lessons/12924) | Lv.2 | 연속된 자연수의 합 투 포인터 / 슬라이딩 윈도우 | [ ] |
| **금** | [연속된 부분 수열의 합](https://school.programmers.co.kr/learn/courses/30/lessons/178870) | Lv.2 | 비내림차순 수열의 정석 투 포인터 구간 탐색 | [ ] |
| **토** | [할인 행사](https://school.programmers.co.kr/learn/courses/30/lessons/131127) | Lv.2 | 10일 고정 크기 슬라이딩 윈도우 + Map 카운팅 | [ ] |
| **일** | [호텔 대실](https://school.programmers.co.kr/learn/courses/30/lessons/155651) | Lv.2 | 시간대별 누적합(차분 배열) 또는 우선순위 큐 스케줄링 | [ ] |
| **월 (Challenge)** | [보석 쇼핑](https://school.programmers.co.kr/learn/courses/30/lessons/67258) | Lv.3 | 카카오 기출: Map을 활용한 가변 길이 투 포인터 최적화 | [ ] |
| **화** | *오답 정리 및 8주차 복습* | - | 투 포인터 이동 조건(합이 작을 때 / 클 때) 경계값 정리 | [ ] |

---

### Week 9. 이분 탐색 (Binary Search) & 매개변수 탐색
> **Goal:** $O(N)$으로 풀리지 않는 거대한 탐색 범위를 $O(\log N)$으로 줄이는 결정 문제(Parametric Search) 전환

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [부족한 금액 계산하기](https://school.programmers.co.kr/learn/courses/30/lessons/82612) | Lv.1 | 등차수열의 합 및 오버플로우(`long`) 감각 잡기 | [ ] |
| **목** | [이진 변환 반복하기](https://school.programmers.co.kr/learn/courses/30/lessons/70129) | Lv.2 | 2진수 비트 변환 및 시뮬레이션 | [ ] |
| **금** | [입국심사](https://school.programmers.co.kr/learn/courses/30/lessons/43238) | Lv.3 | Parametric Search의 대표 문제 (시간 기준 이분 탐색) | [ ] |
| **토** | [순위 검색](https://school.programmers.co.kr/learn/courses/30/lessons/72412) | Lv.2 | 카카오 기출: 쿼리 조합 Map + 점수 정렬 후 `lower_bound` | [ ] |
| **일** | [징검다리 건너기](https://school.programmers.co.kr/learn/courses/30/lessons/64062) | Lv.3 | 카카오 기출: 통과 인원 수 기준 매개변수 탐색 | [ ] |
| **월 (Challenge)** | [징검다리](https://school.programmers.co.kr/learn/courses/30/lessons/43236) | Lv.4 | 바위 제거 거리의 최솟값을 최대로 만드는 심화 이분 탐색 | [ ] |
| **화** | *오답 정리 및 9주차 복습* | - | `left <= right` 경계 조건 및 최적해 갱신 시점 점검 | [ ] |

---

### Week 10. 동적 계획법 (DP) 기초 & 심화
> **Goal:** 큰 문제를 부분 문제로 쪼개고 점화식을 세워 중복 연산을 완벽히 제거하기

| 요일 | 문제명 | 난이도 | 핵심 포인트 | 상태 |
| :---: | :--- | :---: | :--- | :---: |
| **수 (Warm-up)** | [피보나치 수](https://school.programmers.co.kr/learn/courses/30/lessons/12945) | Lv.2 | 1차원 Memoization / Bottom-up DP 기초 | [ ] |
| **목** | [2 x n 타일링](https://school.programmers.co.kr/learn/courses/30/lessons/12900) | Lv.2 | 타일 배치 점화식 도출 ($dp[i] = dp[i-1] + dp[i-2]$) | [ ] |
| **금** | [땅따먹기](https://school.programmers.co.kr/learn/courses/30/lessons/12913) | Lv.2 | 이전 행과 동일 열 선택 금지 조건의 2차원 DP | [ ] |
| **토** | [정수 삼각형](https://school.programmers.co.kr/learn/courses/30/lessons/43105) | Lv.3 | 전형적인 위에서 아래로 누적 최댓값 갱신 DP | [ ] |
| **일** | [등굣길](https://school.programmers.co.kr/learn/courses/30/lessons/42898) | Lv.3 | 장애물이 있는 격자 경로 수 합산 (모듈러 연산 주의) | [ ] |
| **월 (Challenge)** | [N으로 표현](https://school.programmers.co.kr/learn/courses/30/lessons/42895) | Lv.3 | Set을 활용한 연산 횟수 기준 집합 DP | [ ] |
| **화** | *10주 로드맵 완주 및 총정리* | - | 취약 유형 파악 후 카카오/실전 기출 모의고사로 전환 | [ ] |