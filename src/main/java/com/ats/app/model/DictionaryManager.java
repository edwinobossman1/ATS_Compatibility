package com.ats.app.model;

import java.util.*;

public class DictionaryManager {

    private static final Map<String, List<String>> DICTIONARIES = new HashMap<>();

    static {
        DICTIONARIES.put("TECHNOLOGIES", Arrays.asList(
            "Java", "Python", "C#", "JavaScript", "AWS", "Azure", "Linux", "Docker", "Kubernetes",
            "Spring Boot", "Hibernate", "SQL", "NoSQL", "Oracle DB", "MongoDB", "PostgreSQL"
        ));
        DICTIONARIES.put("SOFTSKILLS", Arrays.asList(
            "Leadership", "Teamwork", "Problem Solving", "Communication", "Adaptability",
            "Critical Thinking", "Time Management", "Conflict Resolution"
        ));
        DICTIONARIES.put("PROTOCOLS", Arrays.asList(
            "HTTP", "HTTPS", "FTP", "SFTP", "SSH", "SMTP", "SNMP", "TCP/IP", "UDP"
        ));
        DICTIONARIES.put("TOOLS", Arrays.asList(
            "Git", "Maven", "Jenkins", "Gradle", "Eclipse", "IntelliJ IDEA", "VS Code",
            "Postman", "Jira", "Confluence"
        ));
        DICTIONARIES.put("ITMETHODOLOGIES", Arrays.asList(
            "Agile", "Scrum", "Kanban", "Waterfall", "DevOps", "CI/CD", "XP", "Lean"
        ));
    }

    public static List<String> getDictionary(String key) {
        return DICTIONARIES.getOrDefault(key, Collections.emptyList());
    }

    public static boolean contains(String key, String value) {
        return DICTIONARIES.getOrDefault(key, Collections.emptyList())
                .stream()
                .anyMatch(v -> v.equalsIgnoreCase(value));
    }

    public static String searchMultiple(String key, List<String> values) {
        List<String> dict = DICTIONARIES.getOrDefault(key, Collections.emptyList());
        List<String> notFound = new ArrayList<>();

        for (String val : values) {
            boolean found = dict.stream().anyMatch(v -> v.equalsIgnoreCase(val));
            if (!found) {
                notFound.add(val);
            }
        }

        if (notFound.isEmpty()) {
            return "✅ [Verde] Todos los elementos fueron encontrados en " + key;
        } else {
            return "❌ [Rojo] No se encontraron: " + String.join(", ", notFound);
        }
    }

    public static Set<String> getCategories() {
        return DICTIONARIES.keySet();
    }
}
