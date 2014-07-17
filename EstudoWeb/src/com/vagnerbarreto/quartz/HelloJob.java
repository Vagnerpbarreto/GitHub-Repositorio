package com.vagnerbarreto.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.br.vagnerbarreto.leitura.LerArquivos;


public class HelloJob implements Job
{
	public void execute(JobExecutionContext context)
	throws JobExecutionException {
		
		LerArquivos arquivos = new LerArquivos();
		arquivos.arquivo();
		
	}
	
}
