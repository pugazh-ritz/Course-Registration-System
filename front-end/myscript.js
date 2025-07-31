function showCourses(){
    fetch("http://localhost:8080/courses") //API End point
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable")

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseCode}</td>
            <td>${course.courseName}</td>
            <td>${course.trainerName}</td>
            <td>${course.durationInWeeks}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}
function showEnrolledCourses(){
    fetch("http://localhost:8080/courses/enrolled") //API End point
    .then((response) => response.json())
    .then((Students) => {
        const dataTable = document.getElementById("enrolltable")

        Students.forEach(student => {
            var row = `<tr>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.courseName}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}