<p align="left"><img src="https://raw.githubusercontent.com/ayaanthedev/ayaanthedev/refs/heads/main/github-metrics.svg" /></p>








### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
