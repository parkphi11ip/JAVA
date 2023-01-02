# KH정보교육원 JAVA 풀스택 과정

22-12-28 ~ JAVA ing.

Git 사이트에서 저장소 이름 변경하는 방법에 대해 포스팅 합니다.



Backjoon 이라는 이름에서 Algorithm이라고 저장소 이름을 변경할 것인데요.

일단 프로젝트 로컬 저장소의 git 연결에 대한 url 변경까지 설명 드리겠습니다.



1. git 저장소 Settings 탭메뉴에서 Repository name을 변경합니다.







Repository name이 변경되면 깃저장소 url도 변경되기 때문에 이를 반영해 주어야 하는데요.





2. git bash를 통해 해당 프로젝트 로컬 경로로 이동합니다.

이때, git remote -v라는 명령어를 이용하면, 현재 프로젝트 저장소 및 url를 출력해줍니다.



$ git remote -v

origin  https://12bme@github.com/12bme/Backjoon.git/ (fetch)

origin  https://12bme@github.com/12bme/Backjoon.git/ (push)



변경전 url 이 적용 되어 있습니다.





3. git remote set-url 명령어를 사용하여 저장소 url을 변경할 수 있습니다.



$ git remote set-url origin https://12bme@github.com/12bme/Algorithm.git/



$ git remote -v

origin  https://12bme@github.com/12bme/Algorithm.git/ (fetch)

origin  https://12bme@github.com/12bme/Algorithm.git/ (push)



이상, Git 원격저장소 이름 및 url 변경 방법이었습니다.


좋아요14
공유하기게시글 관리구독하기
