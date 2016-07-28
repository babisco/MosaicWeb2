1. Spring Starter Project 생성
	
	- Name : MosaicWeb
	- Type : Gradle(Buildship)
	- Packaging : war
	- Group : com.hybrid
	- Artifact : MosaicWeb
	- Package : com.hybrid
	- dependencies : Web 선택

2. 형상관리 

	- Remote Repository 생성 => github.com
	- Local Repository 생성
		- >> dir /a > .gitignore
		- >> notepad .gitignore 편집
		- >> git init
		- >> git status
		- >> git add * or git add .
		- >> git log
		- >> git commit -m "first commit"
	- Local => Remote push (최초 동기화)
		- >> git remote -v
		- >> git remote remove origin
		- >> git remote add origin https://github.com/babisco/MosaicWeb.git
		- >> git push -u origin master 
	- 개발자 2 clone 수행
		- >> git clone https://github.com/babisco/MosaicWeb.git
		- >> git clone https://github.com/babisco/MosaicWeb.git MosaicWebDev
		- >> Eclipse Gradle Import

3. HTML Setting
	
	- setting 불필요 (dependencis를 web으로 설정했기 때문에)
	- mkdir src/main/webapp 폴더생성
	- notepad src/main/webapp/Hello.html
	- gradle bootRun
	- Chrome => http://localhost:8080/Hello.html

4. JSP Setting
	
	- mvnrepository.com => search : tomcat jasper
	- build.gradle dependency (open with minimalist)
		- >> providedRuntime group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '8.5.4' 
	- notepad src/main/webapp/Hello.jsp
	- gradle bootRun
	- Chrome => http://localhost:8080/Hello.jsp
	- Eclipse => Gradle Refresh

5. Servlet

	- Project Facets 추가
		=> Dynamic Web Module 3.1 
		=> Java 1.8
		=> JavaScript 1.0
	- MosaicWebApplication.java => @ServletComponentScan 추가
	- com.hybrid.servlet.HelloServlet.java 생성
	- gradle bootRun
	- Chrome => http://localhost:8080/HelloServlet
	
6. SpringLoaded 설정 (리로드기능)
	
	- mvnrepository.com => search : springloaded
	- build.gradle에 설정(두곳)
		- >> buildscript < dependencies => classpath("org.springframework:springloaded:1.2.6.RELEASE")
		- >> dependencies => compile group: 'org.springframework', name: 'springloaded', version: '1.2.6.RELEASE'
	- Eclipse Output Directory 변경
		- >> bin => build/classes/main
		(properties->Java build path->source->output folder)