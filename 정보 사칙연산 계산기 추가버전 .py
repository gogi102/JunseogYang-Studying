{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyNcZ6PCJZYoxz5H1P6Pbi1O",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/gogi102/JunseogYang-Java-Python/blob/main/Untitled13.ipynb\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "uRT3Ox-Q7rgZ"
      },
      "outputs": [],
      "source": [
        "#사칙연산 계산기 만들기!\n",
        "\n",
        "a = int(input(\"사칙연산을 할 숫자를 입력 :\")) #a 라는 변수에 사칙연산을 할 수를 입력받는 코드이다.\n",
        "b = str(input(\"+,-,*,/,**,%,//중 무엇을 할지 입력 :\"))#b 라는 변수에 + - * / 중 하나를 입력 받는 코드이다.\n",
        "c = int(input(\"나눌 수 입력:\"))#c라는 변수에 a를 연산할 값은 받는 함수이다.\n",
        "if b == \"+\":\n",
        "  print(a,\"+\", c,\"=\",a+c)\n",
        "elif b == \"-\":\n",
        "   print(a,\"-\",c,\"=\",a-c)\n",
        "elif b == \"*\":\n",
        "  print(a,\"*\",c,\"=\",a*c)\n",
        "elif b == \"/\" :\n",
        "  print(a,\"/\",c,\"=\",a/c)\n",
        "elif b == \"**\":\n",
        "   print(a,\"**\",c,\"=\",a**c)\n",
        "elif b == \"%\":\n",
        "   print(a,\"%\",c,\"=\",a%c)\n",
        "elif b == \"//\":\n",
        "   print(a,\"//\",c,\"=\",a//c)\n",
        "else :\n",
        "  print(\"다시 ㄱ\")"
      ]
    }
  ]
}
