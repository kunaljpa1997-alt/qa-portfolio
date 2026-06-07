package com.portfolio.qaportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class QaPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(QaPortfolioApplication.class, args);
    }
}

@RestController
class PortfolioController {

    @GetMapping("/")
    public String home() {
        return """
<!DOCTYPE html>
<html lang=\"en\">
<head>
    <meta charset=\"UTF-8\">
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
    <title>Kunal Patil | QA Automation Engineer</title>

  <style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        scroll-behavior: smooth;
    }

    body {
        font-family: Arial, sans-serif;
        background: #0B1120;
        color: #F8FAFC;
        line-height: 1.6;
    }

    .container {
        width: 90%;
        max-width: 1250px;
        margin: auto;
    }

    nav {
        position: sticky;
        top: 0;
        background: rgba(11, 17, 32, 0.95);
        backdrop-filter: blur(10px);
        z-index: 1000;
        border-bottom: 1px solid #1E293B;
    }

    .nav-content {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 20px 0;
    }

    .logo {
        font-size: 26px;
        font-weight: bold;
        color: #10B981;
    }

    .nav-links a {
        text-decoration: none;
        color: #CBD5E1;
        margin-left: 25px;
        transition: 0.3s;
    }

    .nav-links a:hover {
        color: #10B981;
    }

    .hero {
        padding: 120px 0;
        background: linear-gradient(to right, #0B1120, #1E293B);
    }

    .hero-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(320px, 1fr));
        gap: 60px;
        align-items: center;
    }

    .hero-text h1 {
        font-size: 62px;
        line-height: 1.1;
        margin-bottom: 25px;
    }

    .hero-text span {
        color: #10B981;
    }

    .hero-text p {
        color: #CBD5E1;
        font-size: 20px;
        margin-bottom: 35px;
    }

    .btn-group {
        display: flex;
        gap: 20px;
        flex-wrap: wrap;
    }

    .btn {
        padding: 14px 28px;
        border-radius: 12px;
        text-decoration: none;
        font-weight: bold;
        transition: 0.3s;
    }

    .primary-btn {
        background: #10B981;
        color: #0B1120;
    }

    .primary-btn:hover {
        transform: translateY(-3px);
    }

    .secondary-btn {
        border: 1px solid #10B981;
        color: #10B981;
    }

    .hero-card {
        background: #1E293B;
        padding: 40px;
        border-radius: 24px;
        border: 1px solid #334155;
        box-shadow: 0px 0px 40px rgba(16,185,129,0.15);
    }

    .hero-card h2 {
        color: #10B981;
        margin-bottom: 20px;
    }

    section {
        padding: 100px 0;
    }

    .section-title {
        text-align: center;
        margin-bottom: 60px;
    }

    .section-title h2 {
        font-size: 46px;
        margin-bottom: 15px;
        color: #10B981;
    }

    .section-title p {
        color: #CBD5E1;
        max-width: 800px;
        margin: auto;
    }

    .stats-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
        gap: 25px;
    }

    .stat-card {
        background: #1E293B;
        padding: 40px;
        border-radius: 24px;
        text-align: center;
        border: 1px solid #334155;
        transition: 0.3s;
    }

    .stat-card:hover {
        transform: translateY(-10px);
        border-color: #10B981;
    }

    .stat-card h3 {
        font-size: 52px;
        color: #10B981;
    }

    .timeline {
        position: relative;
        max-width: 1000px;
        margin: auto;
    }

    .timeline::after {
        content: '';
        position: absolute;
        width: 4px;
        background: #10B981;
        top: 0;
        bottom: 0;
        left: 50%;
        margin-left: -2px;
    }

    .timeline-item {
        padding: 20px 40px;
        position: relative;
        width: 50%;
    }

    .timeline-item::after {
        content: '';
        position: absolute;
        width: 22px;
        height: 22px;
        right: -11px;
        background: #10B981;
        border-radius: 50%;
        top: 30px;
    }

    .left {
        left: 0;
    }

    .right {
        left: 50%;
    }

    .right::after {
        left: -11px;
    }

    .timeline-content {
        background: #1E293B;
        padding: 30px;
        border-radius: 20px;
        border: 1px solid #334155;
    }

    .timeline-content h3 {
        color: #10B981;
        margin-bottom: 12px;
    }

    .projects-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
        gap: 30px;
    }

    .project-card {
        background: #1E293B;
        padding: 35px;
        border-radius: 24px;
        border: 1px solid #334155;
        transition: 0.3s;
    }

    .project-card:hover {
        transform: translateY(-8px);
        border-color: #10B981;
    }

    .project-card h3 {
        color: #10B981;
        margin-bottom: 15px;
        font-size: 28px;
    }

    .project-card ul {
        margin-top: 15px;
        padding-left: 20px;
        color: #CBD5E1;
    }

    .skills-wrapper {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
        gap: 25px;
    }

    .skill-box {
        background: #1E293B;
        padding: 35px;
        border-radius: 24px;
        border: 1px solid #334155;
    }

    .skill-box h3 {
        color: #10B981;
        margin-bottom: 20px;
    }

    .skill-box li {
        margin-bottom: 10px;
        color: #CBD5E1;
    }

    .achievement-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
        gap: 25px;
    }

    .achievement-card {
        background: #1E293B;
        padding: 35px;
        border-radius: 24px;
        border: 1px solid #334155;
    }

    .achievement-card h3 {
        color: #10B981;
        margin-bottom: 15px;
    }

    .hobbies-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
        gap: 25px;
    }

    .hobby-card {
        background: #1E293B;
        padding: 35px;
        border-radius: 24px;
        border: 1px solid #334155;
        text-align: center;
    }

    .hobby-card h3 {
        font-size: 28px;
        margin-bottom: 15px;
    }

    footer {
        background: #020617;
        text-align: center;
        padding: 40px 20px;
        border-top: 1px solid #1E293B;
    }

    footer p {
        color: #94A3B8;
    }

    @media(max-width: 900px) {
        .timeline::after {
            left: 31px;
        }

        .timeline-item {
            width: 100%;
            padding-left: 80px;
            padding-right: 20px;
        }

        .timeline-item::after {
            left: 20px;
        }

        .right {
            left: 0;
        }

        .hero-text h1 {
            font-size: 44px;
        }
    }
</style>
</head>
<body>

<nav>
    <div class=\"container nav-content\">
        <div class=\"logo\">QA Portfolio</div>

        <div class=\"nav-links\">
            <a href=\"#about\">About</a>
            <a href=\"#experience\">Experience</a>
            <a href=\"#projects\">Projects</a>
            <a href=\"#skills\">Skills</a>
            <a href=\"#contact\">Contact</a>
             <a href="/resume/Kunal_Patil_Resume.pdf"
                         target="_blank"
                    class="btn primary-btn">
                  View Resume
             </a>
                
        </div>
    </div>
</nav>

<section class=\"hero\" id=\"about\">
    <div class=\"container hero-grid\">
        <div class=\"hero-text\">
            <h1>
                QA Automation <span>Engineer</span>
            </h1>
            <p>
                IT Professional with 5 years of total experience in the IT industry, including strong experience in QA Engineering with expertise in Manual Testing, Automation Testing, API Testing, and security-domain enterprise applications. Also experienced in Full Stack Development and agile software delivery processes.
            </p>
            <div class=\"btn-group\">
                <a href=\"#projects\" class=\"btn primary-btn\">View Projects</a>
                <a href=\"#contact\" class=\"btn secondary-btn\">Contact Me</a>
            </div>
        </div>

        <div class=\"hero-card\">
            <h2>Professional Summary</h2>
            <p>
                QA Professional specializing in Manual and Automation Testing. Experienced in functional, regression, integration, and API testing with strong expertise in identifying critical and legacy defects. Skilled in working within Agile development environments, collaborating with cross-functional teams, and ensuring high software quality through detailed testing practices.
            </p>
            <br>
            <p>
                Hands-on experience with frontend and backend application testing along with strong analytical and problem-solving abilities. Proficient in using Selenium with TestNG for automation testing, API automation testing, Jira for defect tracking and project management, and development tools such as Eclipse and IntelliJ IDEA.
            </p>
        </div>

    </div>
</section>

<section>
    <div class=\"container\">
        <div class=\"section-title\">
            <h2>Professional Highlights</h2>
            <p>Experience and quality-driven achievements across testing and development projects.</p>
        </div>
        <div class=\"stats-grid\">

            <div class=\"stat-card\">
                <h3>5+</h3>
                <p>Years Experience</p>
            </div>

            <div class=\"stat-card\">
                <h3>800+</h3>
                <p>Bugs Identified</p>
            </div>

            <div class=\"stat-card\">
                <h3>250+</h3>
                <p>Improvement Suggestions</p>
            </div>

            <div class=\"stat-card\">
                <h3>5</h3>
                <p>Total Projects</p>
            </div>
            
            <div class=\"stat-card\">
               <h3>ISTBQ</h3>            
                  <p>Cetificates</p>
            </div>

        </div>

    </div>
</section>

<section id=\"experience\">
    <div class=\"container\">

        <div class=\"section-title\">
            <h2>Career Journey</h2>
            <p>Professional timeline covering QA Engineering and Full Stack Development experience.</p>
        </div>

        <div class=\"timeline\">

            <div class=\"timeline-item left\">
                <div class=\"timeline-content\">
                    <h3>QA Automation Engineer</h3>
                    <p><strong>Duration:</strong> 3 Years</p>
                    <p><strong>Domain:</strong> Enterprise Security Solutions</p>
                    <br>
                    <p>
                        Worked on manual testing, automation testing, regression testing, API testing, and bug reporting for enterprise security-domain projects.
                    </p>
                </div>
            </div>

            <div class=\"timeline-item right\">
                <div class=\"timeline-content\">
                    <h3>Software Development Experience</h3>
                    <p><strong>Duration:</strong> 2 Years</p>
                    <p><strong>Technology:</strong> React.js & SQL</p>
                    <br>
                    <p>
                      Worked on frontend and backend application development while collaborating with agile development teams, and performed detailed testing to ensure application quality and functionality.                    </p>
                </div>
            </div>

        </div>

    </div>
</section>

<section id=\"projects\">
    <div class=\"container\">

        <div class=\"section-title\">
            <h2>Project Portfolio</h2>
            <p>Security-domain QA projects and full stack development projects.</p>
        </div>

        <div class=\"projects-grid\">

            <div class=\"project-card\">
                <h3>GreenRocket2FA</h3>
                <p><strong>Role:</strong> QA Engineer</p>
                <p><strong>Domain:</strong> Security Application</p>

                <ul>
                    <li>Selenium Automation</li>
                    <li>API Automation Testing</li>
                    <li>Functional Testing</li>
                    <li>Regression Testing</li>
                    <li>Postman Validation</li>
                    <li>Bug Tracking</li>
                    <li>Quality Assurance</li>
                    <li>Response Verification</li>
                    <li>End-to-End Testing</li>
                </ul>
            </div>

            <div class=\"project-card\">
                <h3>Windows GreenRocket2FA</h3>
                <p><strong>Role:</strong> QA Engineer</p>
                <p><strong>Domain:</strong> Security Application</p>

                <ul>
                   <li>Functional Testing</li>
                    <li>Regression Testing</li>
                    <li>Test Case Execution</li>
                    <li>Bug Tracking</li>
                    <li>Quality Assurance</li>
                    <li>Postman Validation</li>
                    <li>Response Verification</li>
                    <li>End-to-End Testing</li>
                </ul>
            </div>

            <div class=\"project-card\">
                <h3>eDwarpaal</h3>
                <p><strong>Role:</strong> QA Engineer</p>
                <p><strong>Domain:</strong> Security Application</p>

                <ul>
                    <li>Selenium Automation</li>
                    <li>API Automation Testing</li>
                    <li>Functional Testing</li>
                    <li>Regression Testing</li>
                    <li>Postman Validation</li>
                    <li>Response Verification</li>
                    <li>End-to-End Testing</li>
                    <li>Bug Tracking</li>
                    <li>Quality Assurance</li>
                </ul>
            </div>

            <div class=\"project-card\">
                <h3>Powermaster</h3>
                <p><strong>Role:</strong> Full Stack Developer</p>
                <p><strong>Technology:</strong> Web Application</p>

                <ul>
                    <li>Backend Development</li>
                    <li>Frontend Integration</li>
                    <li>Database Handling</li>
                    <li>Agile Development</li>
                    <li>Functional Testing</li>
                    <li>Regression Testing</li>
                </ul>
            </div>

            <div class=\"project-card\">
                <h3>Corob</h3>
                <p><strong>Role:</strong> Full Stack Developer</p>
                <p><strong>Technology:</strong> Web Application</p>

                <ul>
                    <li>Feature Development</li>
                    <li>Code Optimization</li>
                    <li>Application Support</li>
                    <li>Deployment Assistance</li>
                    <li>Functional Testing</li>
                    <li>Regression Testing</li>
                </ul>
            </div>

        </div>

    </div>
</section>
                <section>
                    <div class=\"container\">
                
                        <div class=\"section-title\">
                            <h2>QA Achievements</h2>
                            <p>Impact created through quality assurance and testing excellence by identifying and resolving many legacy bugs.</p>
                        </div>
                
                        <div class=\"achievement-grid\">
                
                            <div class=\"achievement-card\">
                                <h3>Critical Defect Detection</h3>
                                <p>
                                    Identified multiple high-severity bugs before production deployment, helping improve application reliability.
                                </p>
                            </div>
                
                            <div class=\"achievement-card\">
                                <h3>Quality Improvement</h3>
                                <p>
                                    Suggested 150+ improvements for usability, stability, and testing process enhancement.
                                </p>
                            </div>
                
                            <div class=\"achievement-card\">
                                <h3>Security Domain Exposure</h3>
                                <p>
                                    Worked extensively on security-domain applications requiring accurate validation and secure workflow testing.
                                </p>
                            </div>
                        </div>
                    </div>
                </section>
                

<section id=\"skills\">
    <div class=\"container\">

        <div class=\"section-title\">
            <h2>Technical Skills</h2>
            <p>Core technical expertise in manual and automation testing.</p>
        </div>

        <div class=\"skills-wrapper\">

            <div class=\"skill-box\">
                <h3>Testing Skills</h3>
                <ul>
                    <li>Manual Testing</li>
                    <li>Automation Testing</li>
                    <li>API Testing</li>
                    <li>Regression Testing</li>
                    <li>Functional Testing</li>
                </ul>
            </div>

            <div class=\"skill-box\">
                <h3>Automation Tools</h3>
                <ul>
                    <li>Selenium</li>
                    <li>Postman</li>
                    <li>REST Assured</li>
                    <li>TestNG</li>
                    <li>IntelliJ IDEA</li>
                </ul>
            </div>

            <div class=\"skill-box\">
                <h3>Development Skills</h3>
                <ul>
                    <li>Java</li>
                    <li>Spring Boot</li>
                    <li>HTML & CSS</li>
                    <li>SQL</li>
                    <li>GitHub</li>
                </ul>
            </div>

            <div class=\"skill-box\">
                <h3>Professional Skills</h3>
                <ul>
                    <li>Analytical Reasoning</li>
                    <li>Critical Thinking</li>
                    <li>Problem Solving</li>
                    <li>Communication</li>
                    <li>Bug Analysis</li>
                    <li>Team Collaboration</li>
                </ul>
            </div>

        </div>

    </div>
</section>

               
<section>
    <div class=\"container\">

        <div class=\"section-title\">
            <h2>Hobbies & Interests</h2>
            <p>Interests that support creativity, focus, and continuous learning.</p>
        </div>

        <div class=\"hobbies-grid\">

            <div class=\"hobby-card\">
                <h3>🏏 Cricket</h3>
                <p>Enjoy playing cricket and team-based activities.</p>
            </div>

            <div class=\"hobby-card\">
                <h3>🏛 History & Culture</h3>
                <p>Interested in historical documentaries and cultural learning.</p>
            </div>

            <div class=\"hobby-card\">
                <h3>✈ Travel</h3>
                <p>Love exploring new places and experiencing different cultures.</p>
            </div>

            <div class=\"hobby-card\">
                <h3>🎨 Graphic Design</h3>
                <p>Interested in logo design and creative digital design concepts.</p>
            </div>

        </div>

    </div>
</section>

<footer id=\"contact\">
    <h2 style=\"margin-bottom: 20px; color:#38BDF8;\">Let's Connect</h2>

    <p>Email: kunalj.pa1997@gmail.com</p>
    <p>LinkedIn: linkedin.com/in/kunal-patil-776244216</p>
    <p>GitHub: github.com/your-profile</p>
     <p>Contact No: 8169384879</p>

    <br>
    <p>
        Built using Java, Spring Boot, HTML, CSS , SQL | QA Automation Engineer Portfolio
    </p>
</footer>

</body>
</html>
                """;
    }
}
