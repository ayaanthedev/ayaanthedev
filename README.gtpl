<p align="left"><img src="https://raw.githubusercontent.com/AyaanSucksAtCoding/AyaanSucksAtCoding/refs/heads/main/github-metrics.svg" /></p>








### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
{{ if not .Repo.IsArchived }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{ end }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
{{ if not .IsArchived }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{ end }}
{{- end }}

