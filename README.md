# calculadora-notas
# Fazer o download do projeto no github https://github.com/LucaGemelli/calculadora-notas
# Ide utilizada 'Eclipse'
# java 11
# link da documentacao da api http://localhost:8080/calculadora-notas/swagger-ui.html#/
## exemplo de json: {
    "alunos" : [
        {
            "id"   : 1,
            "nome" : "João Silva",
            "disciplinas" : [
                {
                    "id"   : 1,
                    "nome" : "Alpro-II",
                    "notas": [{"id" : 1, "prova1" : 10, "peso1": 5}, {"id" : 2, "prova2" : 8.0, "peso2": 2 }, {"id" : 3, "prova3" : 7.5, "peso3": 3}]
                },
                {
                    "id"   : 2,
                    "nome" : "Calculo-A",
                    "notas": [{"id" : 4, "prova1" : 2.8}, {"id" : 5, "prova2" : 5.3}, {"id" : 6, "prova3" : 3.2}]
                },
                {
                    "id"   : 3,
                    "nome" : "Cultura-Religiosa",
                    "notas": [{"id" : 7, "prova1" : 8.0}, {"id" : 8, "prova2" : 9.8}, {"id" : 9, "prova3" : 7.8}]
                }
            ]
        },
        {
            "id"   : 2,
            "nome" : "Ana Maria",
            "disciplinas" : [
                {
                    "id"   : 1,
                    "nome" : "Alpro-II",
                    "notas": [{"id" : 11, "prova1" : 7.0}, {"id" : 12, "prova2" : 8.0}, {"id" : 13, "prova3" : 7.5}]
                },
                {
                    "id"   : 2,
                    "nome" : "Calculo-A",
                    "notas": [{"id" : 14, "prova1" : 8.9}, {"id" : 15, "prova2" : 7.6}, {"id" : 16, "prova3" : 6.7}]
                },
                {
                    "id"   : 3,
                    "nome" : "Cultura-Religiosa",
                    "notas": [{"id" : 17, "prova1" : 8.0}, {"id" : 18, "prova2" : 9.8}, {"id" : 19, "prova3" : 7.8}]
                }
            ]
        },
        {
            "id"   : 3,
            "nome" : "Jose Claudio",
            "disciplinas" : [
                {
                    "id"   : 1,
                    "nome" : "Alpro-II",
                    "notas": [{"id" : 21, "prova1" : 4.5}, {"id" : 22, "prova2" : 9.1}, {"id" : 23, "prova3" : 0.0}]
                },
                {
                    "id"   : 2,
                    "nome" : "Calculo-A",
                    "notas": [{"id" : 24, "prova1" : 2.4}, {"id" : 25, "prova2" : 3.2}, {"id" : 26, "prova3" : 5.7}]
                }
            ]
        },
        {
            "id"   : 4,
            "nome" : "Josiane Silveira",
            "disciplinas" : [
                {
                    "id"   : 1,
                    "nome" : "Alpro-II",
                    "notas": [{"id" : 27, "prova1" : 4.5}, {"id" : 28, "prova2" : 9.1}, {"id" : 29, "prova3" : 0.0}]
                },
                {
                    "id"   : 4,
                    "nome" : "Etica",
                    "notas": [{"id" : 30, "prova1" : 5.8}, {"id" : 31, "prova2" : 7.4}, {"id" : 32, "prova3" : 4.8}]
                }
            ]
        },
        {
            "id"   : 5,
            "nome" : "Karen Rodrigues",
            "disciplinas" : [
                {
                    "id"   : 3,
                    "nome" : "Cultura-Religiosa",
                    "notas": [{"id" : 33, "prova1" : 0.0}, {"id" : 34, "prova2" : 8.7}, {"id" : 35, "prova3" : 7.5}]
                },
                {
                    "id"   : 2,
                    "nome" : "Calculo-A",
                    "notas": [{"id" : 36, "prova1" : 6.8}, {"id" : 37, "prova2" : 5.8}, {"id" : 38, "prova3" : 4.3}]
                }
            ]
        },
        {
            "id"   : 6,
            "nome" : "Juliano Souza",
            "disciplinas" : [
                {
                    "id"   : 2,
                    "nome" : "Calculo-A",
                    "notas": [{"id" : 39, "prova1" : 1.2}, {"id" : 40, "prova2" : 4.5}, {"id" : 41, "prova3" : 2.4}]
                },
                {
                    "id"   : 3,
                    "nome" : "Cultura-Religiosa",
                    "notas": [{"id" : 44, "prova1" : 7.2}, {"id" : 43, "prova2" : 8.4}, {"id" : 42, "prova3" : 5.2}]
                },
                {
                    "id"   : 4,
                    "nome" : "Etica",
                    "notas": [{"id" : 45, "prova1" : 8.1}, {"id" : 46, "prova2" : 8.8}, {"id" : 47, "prova3" : 8.9}]
                },
                {
                    "id"   : 1,
                    "nome" : "Alpro-II",
                    "notas": [{"id" : 48, "prova1" : 5.7}, {"id" : 49, "prova2" : 8.4}, {"id" : 50, "prova3" : 8.4}]
                }
            ]
        }
    ]
}
