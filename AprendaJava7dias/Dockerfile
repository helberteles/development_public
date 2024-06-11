# Usar uma imagem base do Ubuntu
FROM ubuntu:20.04

# Evitar perguntas interativas durante a instalação de pacotes
ENV DEBIAN_FRONTEND=noninteractive

# Atualizar os pacotes e instalar dependências
RUN apt-get update && apt-get install -y \
    wget \
    curl \
    gnupg \
    software-properties-common \
    apt-transport-https \
    && rm -rf /var/lib/apt/lists/*

# Instalar o Java (OpenJDK)
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk

# Instalar o Visual Studio Code
RUN wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > microsoft.gpg \
    && install -o root -g root -m 644 microsoft.gpg /usr/share/keyrings/ \
    && sh -c 'echo "deb [arch=amd64 signed-by=/usr/share/keyrings/microsoft.gpg] https://packages.microsoft.com/repos/code stable main" > /etc/apt/sources.list.d/vscode.list' \
    && apt-get install -y apt-transport-https \
    && apt-get update \
    && apt-get install -y code \
    && rm -rf /var/lib/apt/lists/*

# Definir o diretório de trabalho
WORKDIR /workspace

# Criar um volume para persistir dados
VOLUME ["/workspace"]

# Comando padrão ao iniciar o contêiner
CMD ["bash"]
