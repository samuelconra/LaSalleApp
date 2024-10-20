package com.samuelconra.lasalleapp.utils

import com.samuelconra.lasalleapp.models.*

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg")
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg"),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg")
)

val subjects = listOf(
    Subject(name = "Metodología de la Investigación", teacher = "Elder De La Rosa Cruz", icon = Lab_research),
    Subject(name = "Conmutación de Redes", teacher = "Luis Felipe Vázquez Rodríguez", icon = Ethernet),
    Subject(name = "Administración de Proyectos", teacher = "Iván Ayala Manrique", icon = Book_4),
    Subject(name = "Procesamiento de Imágenes", teacher = "Emmanuel Ovalle Magallanes", icon = Images),
    Subject(name = "Taller de Desarrollo Móvil", teacher = "Teach", icon = Android2),
    Subject(name = "Modelos Abstractos", teacher = "Pedro León Cruz Parada", icon = Code),
    Subject(name = "Administración de Base de Datos", teacher = "Luis Enrique Cuellar Vivia", icon = Database),
    Subject(name = "Mundo desde Perspectiva Cristiana", teacher = "Daniel García Chavarín", icon = Eye_tracking)
)

val student = Student(
    name = "Samuel",
    firstSurname = "Conde",
    secondSurname = "Rangel",
    birth = "14-10-2004",
    email = "scr77164@lasallebajio.edu.mx",
    career = "Ingeniería en Software y Sistemas Computacionales",
    semester = 5,
    enrollment = 77164,
    subjects = listOf(
        StudentSubject(
            id = 1,
            subject = subjects[0],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 9.9, activities = 9.3, project = 10.0, exam = 9.2),
                Midterm(name = "Parcial 2", assignments = 8.5, activities = 8.5, project = 9.0, exam = 8.0),
                Midterm(name = "Parcial 3", assignments = 9.1, activities = 9.2, project = 10.0, exam = 9.6)
            )
        ),
        StudentSubject(
            id = 2,
            subject = subjects[1],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 7.5, activities = 8.0, project = 8.0, exam = 7.0),
                Midterm(name = "Parcial 2", assignments = 8.0, activities = 8.5, project = 9.0, exam = 8.5),
                Midterm(name = "Parcial 3", assignments = 9.0, activities = 9.5, project = 9.0, exam = 10.0)
            )
        ),
        StudentSubject(
            id = 3,
            subject = subjects[2],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 6.1, activities = 6.9, project = 5.5, exam = 6.1),
                Midterm(name = "Parcial 2", assignments = 6.5, activities = 7.4, project = 6.9, exam = 6.9),
                Midterm(name = "Parcial 3", assignments = 7.9, activities = 8.3, project = 5.8, exam = 4.0)
            )
        ),
        StudentSubject(
            id = 4,
            subject = subjects[3],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 9.5, activities = 9.0, project = 9.0, exam = 9.0),
                Midterm(name = "Parcial 2", assignments = 9.0, activities = 9.0, project = 8.5, exam = 9.5),
                Midterm(name = "Parcial 3", assignments = 10.0, activities = 10.0, project = 10.0, exam = 10.0)
            )
        ),
        StudentSubject(
            id = 5,
            subject = subjects[4],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 10.0, activities = 10.0, project = 10.0, exam = 10.0),
                Midterm(name = "Parcial 2", assignments = 10.0, activities = 10.0, project = 10.0, exam = 10.0),
                Midterm(name = "Parcial 3", assignments = 10.0, activities = 10.0, project = 10.0, exam = 10.0)
            )
        ),
        StudentSubject(
            id = 6,
            subject = subjects[5],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 8.2, activities = 6.5, project = 8.7, exam = 9.6),
                Midterm(name = "Parcial 2", assignments = 8.8, activities = 7.2, project = 7.8, exam = 7.1),
                Midterm(name = "Parcial 3", assignments = 8.4, activities = 9.9, project = 8.4, exam = 9.5)
            )
        ),
        StudentSubject(
            id = 7,
            subject = subjects[6],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 8.2, activities = 8.4, project = 8.5, exam = 10.0),
                Midterm(name = "Parcial 2", assignments = 9.8, activities = 9.6, project = 9.4, exam = 8.5),
                Midterm(name = "Parcial 3", assignments = 9.9, activities = 9.5, project = 9.1, exam = 10.0)
            )
        ),
        StudentSubject(
            id = 8,
            subject = subjects[7],
            midterms = listOf(
                Midterm(name = "Parcial 1", assignments = 8.5, activities = 9.9, project = 8.3, exam = 9.9),
                Midterm(name = "Parcial 2", assignments = 8.1, activities = 9.2, project = 9.0, exam = 8.5),
                Midterm(name = "Parcial 3", assignments = 10.0, activities = 10.0, project = 9.3, exam = 10.0)
            )
        )
    ),

    payments = listOf(
        Payment(1, period = "Enero", dueDate = "15-01-2024", status = PaymentStatus.PAID),
        Payment(2, period = "Febrero", dueDate = "15-02-2024", status = PaymentStatus.PAID),
        Payment(3, period = "Marzo", dueDate = "15-03-2024", status = PaymentStatus.PAID),
        Payment(4, period = "Abril", dueDate = "15-04-2024", status = PaymentStatus.PAID),
        Payment(5, period = "Mayo", dueDate = "15-05-2024", status = PaymentStatus.PAID),
        Payment(6, period = "Junio", dueDate = "15-06-2024", status = PaymentStatus.PAID),
        Payment(7, period = "Julio", dueDate = "15-07-2024", status = PaymentStatus.PAID),
        Payment(8, period = "Agosto", dueDate = "15-08-2024", status = PaymentStatus.PAID),
        Payment(9, period = "Septiembre", dueDate = "15-09-2024", status = PaymentStatus.PAID),
        Payment(10, period = "Octubre", dueDate = "15-10-2024", status = PaymentStatus.OVERDUE),
        Payment(11, period = "Noviembre", dueDate = "15-11-2024", status = PaymentStatus.PENDING),
        Payment(12, period = "Diciembre", dueDate = "15-12-2024", status = PaymentStatus.PENDING),
    )
)